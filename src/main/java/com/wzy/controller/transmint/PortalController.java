package com.wzy.controller.transmint;

import com.baomidou.mybatisplus.plugins.Page;
import com.wzy.domain.SysContent;
import com.wzy.service.system.SysContentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * 类功能说明: 前端管理
 * 类修改者	创建日期2019/3/5
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
@Controller
@RequestMapping("/portal")
public class PortalController {

    private static final Logger log = LoggerFactory.getLogger(PortalController.class);


    @Autowired
    private SysContentService sysContentService;
    @RequestMapping("/index")
    public String helloWorld(){
        return "portal/index";
    }

    @RequestMapping("/blog")
    public String blogPage(){
        return "portal/blog";
    }

    @RequestMapping("/demo")
    public String demo(){
        return "portal/demo1";
    }

    @RequestMapping("/singlePost")
    public ModelAndView singlePost(@RequestParam("tid") Integer tid){
        ModelAndView modal = new ModelAndView();
        try{
            SysContent sysResources = sysContentService.selectById(tid);
            modal.addObject("detail",sysResources);
            modal.setViewName("portal/single-post");
//            modal.setViewName("portal/demo1");
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return modal;
    }

    @RequestMapping("/about")
    public String about(){
        return "portal/about";
    }
    @RequestMapping("/grid")
    public ModelAndView grid(ModelAndView modal){
//        modal.setViewName("ftl/userList");
//        List<User> us =  userService.selectList(new EntityWrapper<User>());
//        modal.addObject("userList",us);
        try{
            /*int current = param.getInteger("current");
            int size = param.getInteger("size");*/
            int current =1;
            int size = 6;
            Map<String, Object> map = new HashMap<>();
            SysContent resource = new SysContent();
//        SubsidiaryCertificate subsidiaryCertificate = param.getObject ( "data",SubsidiaryCertificate.class );
            Page<SysContent> page = new Page<SysContent>(current, size);
            Page<SysContent> sysResources = sysContentService.queryCondition(page,resource);
//            Page<SysResources> list = page.setRecords(sysResources);
            modal.addObject("resources",sysResources.getRecords());
            modal.setViewName("portal/grid");
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return modal;
    }
}
