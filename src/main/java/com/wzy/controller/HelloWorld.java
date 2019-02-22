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
public class HelloWorld {

    @RequestMapping("/hello")
    @ResponseBody
     public Map helloWorld(){
         Map map = new HashMap();
         map.put("hello","world");
         return  map;
     }
}
