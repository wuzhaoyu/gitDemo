package com.wzy.controller.FileUpload;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * 类功能说明: @RestController表示该类下的方法会在自动做json格式的转化
 * 类修改者	创建日期2019/2/14
 * 修改说明
 * <p>Title: uploadContrller.java</p>
 *
 * @author Wuzhaoyu
 * @version V1.0
 **/
@RestController
public class uploadContrller {

    /**
     * 上传文件
     * @param fileName
     * @return
     */
    @RequestMapping(value = "/fileUploadController",method = RequestMethod.POST)
    public Map<String,Object> fileUpload(MultipartFile fileName){
          System.out.println(fileName.getOriginalFilename());
        try {
            fileName.transferTo(new File("G:/"+fileName.getOriginalFilename()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Map map = new HashMap();
        map.put("mes","success");
        return map;
    }
}
