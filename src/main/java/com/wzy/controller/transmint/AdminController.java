package com.wzy.controller.transmint;

import com.wzy.service.system.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类功能说明: 后台管理
 * 类修改者	创建日期2019/3/5
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
@Controller
@RequestMapping("/admin")
public class AdminController {

    private static final Logger log = LoggerFactory.getLogger(AdminController.class);

    @Autowired
    private UserService userService;


    @RequestMapping("/index")
    public String adminPage(){
        return  "admin/index";
    }

    @RequestMapping("/user_index")
    public String userIndex(){
        return  "admin/user/user_index";
    }

    @RequestMapping("/uiButtons")
    public String uiButtons(){
        return  "admin/ui-buttons";
    }


    /**
     * 基础数据表
     * @return
     */
    @RequestMapping("/tables-data")
    public String tablesData(){
        return  "admin/tables-data";
    }

    /**
     * 基础表单
     * @return
     */
    @RequestMapping("/forms-basic")
    public String  formsBasic(){
        return  "admin/forms-basic";
    }

    /**
     * 基础弹窗
     * @return
     */
    @RequestMapping("/ui-modals")
    public String  uiModals(){
        return  "admin/ui-modals";
    }
    /**
     * 登录
     * @return
     */
    @RequestMapping("/page-login")
    public String  pageLogin(){
        return  "admin/page-login";
    }
    /**
     * 注册
     * @return
     */
    @RequestMapping("/page-register")
    public String  pageRegister(){
        return  "admin/page-register";
    }
}
