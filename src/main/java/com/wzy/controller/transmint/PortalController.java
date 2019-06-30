package com.wzy.controller.transmint;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.wzy.entity.system.SysResources;
import com.wzy.entity.system.User;
import com.wzy.service.system.SysResourcesService;
import com.wzy.service.system.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
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
    private UserService userService;

    @Autowired
    private SysResourcesService sysResourcesService;
    @RequestMapping("/index")
    public String helloWorld(){
        return "portal/index";
    }

    @RequestMapping("/blog")
    public String blogPage(){
        return "portal/blog";
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
            SysResources resource = new SysResources();
//        SubsidiaryCertificate subsidiaryCertificate = param.getObject ( "data",SubsidiaryCertificate.class );
            Page<SysResources> page = new Page<SysResources>(current, size);
            Page<SysResources> sysResources = sysResourcesService.queryCondition(page,resource);
//            Page<SysResources> list = page.setRecords(sysResources);
            modal.addObject("resources",sysResources.getRecords());
            modal.setViewName("portal/grid");
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return modal;
    }
}
