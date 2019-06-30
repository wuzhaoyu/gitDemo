package com.wzy.controller.system;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.wzy.common.RedisUtils;
import com.wzy.common.Result;
import com.wzy.common.ResultCode;
import com.wzy.common.ResultMsg;
import com.wzy.entity.system.User;
import com.wzy.service.system.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/2/18
 * 修改说明
 * <p>Title: TestController.java</p>
 *
 * @author Wzy
 * @version V1.0
 **/
@Controller
@RequestMapping("api/user/")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @Autowired
    private RedisUtils redisUtils;

    @PostMapping("/queryAlluser")
    @ResponseBody
    public ResultMsg userList(@RequestBody JSONObject param){
        try {
            int current = param.getInteger ("current");
            int size = param.getInteger ("size");
            Map<String,Object> map = new HashMap<>();
//        SubsidiaryCertificate subsidiaryCertificate = param.getObject ( "data",SubsidiaryCertificate.class );
            Page<Map<String,Object>> page = new Page<Map<String,Object>> (current,size);
            Page<Map<String,Object>> list = userService.selectCondition (page,map);
            return ResultMsg.success(list);
//        redisUtils.set("test",users);

        } catch (Exception e) {
            return ResultMsg.create(400,e.toString());
        }

    }


    /**
     * 完成用户添加
     *@Valid 开启对Users对象的数据校验
     *BindingResult:封装了校验的结果
     */
    @PostMapping("/save1")
    public String saveUser( @Valid User user, BindingResult result){
        /*try {
            JSONObject user = object.getObject("user");

        } catch (JSONException e) {
            e.printStackTrace();
        }*/
        if(result.hasErrors()){
            return "thyemleaf/add";
        }
        System.out.println(user);
        userService.insert(user);
        return "thyemleaf/ok";
    }
    /**
     *
     * 如果想为传递的对象更改名称，可以使用@ModelAttribute("aa")这表示当前传递的对象的key为aa。
     * 那么我们在页面中获取该对象的key也需要修改为aa
     * @param user
     * @return
     */
    @RequestMapping("/addPage")
    public String addPage( User user){
//        List<User> users = userService.selectCondition();
//        redisUtils.set("test",users);
        return "thyemleaf/add";
    }

    /**
     *登录
     * @param param
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public Result login(@RequestBody JSONObject param){
        User us =  userService.selectOne(new EntityWrapper<User>().where("user_name={0}", param.getString("userName")).and("password={0}", param.getString("password")));
        System.out.println(us);
        return Result.success();
    }

    /**
     * 新增用户
     *
     * @param param
     * @return
     */
    @PostMapping("/save")
    public Result add(@RequestBody JSONObject param, HttpServletRequest request) {
        HttpSession session = request.getSession();
        User user = param.getObject("user", User.class);

//        todo 判断当前传值是否存在，不存在自动填充0
        int id = 0;
        User us =  userService.selectOne(new EntityWrapper<User>().where("user_name={0}", user.getUserName()));
        if (us != null) {
            id = us.getId();
        }
        if ((user.getId() == null && 0 != id) || (null != user.getId() && user.getId() != id)) {
            return Result.create(200, "当前用户已存在");
        }
        if (null == user.getId()) {
            try {
                if (null == user.getPassword()) {
                    user.setPassword("888888");
                }
                user.setCreatedAt(new Date());
                userService.insert(user);
                return Result.success();
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                return Result.create(ResultCode.ERROR_SAVE_FAILED, ResultCode.ERROR_SAVE_FAILED_MSG);
            }

        } else {
            try {
                user.setUpdatedAt(new Date());
                userService.updateById(user);
                return Result.success();
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                return Result.create(ResultCode.ERROR_SAVE_FAILED, ResultCode.ERROR_SAVE_FAILED_MSG);
            }
        }
    }
    /**
     *登录
     * @param
     * @return
     */
    @RequestMapping("/selectAll")
    @ResponseBody
    public Result selectAll(){
        List<User> us =  userService.selectList(new EntityWrapper<User>());
        System.out.println(us);
        return Result.success(us);
    }
}
