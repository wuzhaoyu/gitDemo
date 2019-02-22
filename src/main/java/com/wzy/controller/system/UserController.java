package com.wzy.controller.system;

import com.wzy.common.Result;
import com.wzy.entity.User;
import com.wzy.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/2/18
 * 修改说明
 * <p>Title: UserController.java</p>
 *
 * @author Wzy
 * @version V1.0
 **/
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryAlluser")
    public Result userList(){
        List<User> users = userService.selectCondition();

        return Result.success(users);
    }
}
