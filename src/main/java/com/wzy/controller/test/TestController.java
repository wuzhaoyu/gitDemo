package com.wzy.controller.test;

import com.wzy.entity.system.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/2/18
 * 修改说明
 * <p>Title: TestController.java</p>
 *
 * @author Wzy
 * @version V1.0
 **/
public class TestController {

    @RequestMapping("/userJsp")
    public String userList(Model modal){
        List<User> list = new ArrayList<>();
        modal.addAttribute("users",list);
        return "/users";
    }
    @RequestMapping("/userFtl")
    public ModelAndView userFtl(ModelAndView modal){
        modal.setViewName("ftl/userList");
        List<User> list = new ArrayList<>();
        modal.addObject("userList",list);
        return modal;
    }
    @RequestMapping("/userThymeleaf")
    public ModelAndView userThymeleaf(ModelAndView modal){
        modal.setViewName("thyemleaf/index");
        List<User> list = new ArrayList<>();
        modal.addObject("userList",list);
        modal.addObject("sex","女");
        return modal;
    }
}
