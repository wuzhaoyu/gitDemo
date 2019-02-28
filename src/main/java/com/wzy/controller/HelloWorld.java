package com.wzy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/2/12
 * 修改说明
 * <p>Title: HelloWorld.java</p>
 *
 * @author Wuzhaoyu
 * @version V1.0
 **/
@Controller
@RequestMapping("/index")
public class HelloWorld {

    @RequestMapping("/hello")
    @ResponseBody
     public Map helloWorld(){
         Map map = new HashMap();
         map.put("hello","world");
         return  map;
     }

    @RequestMapping("/index")
    public String adminPage(){
        return  "admin/index";
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
