package com.wzy.controller.portal;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.wzy.common.ResultCode;
import com.wzy.common.ResultMsg;
import com.wzy.controller.system.AbstractController;
import com.wzy.entity.system.SysResources;
import com.wzy.service.system.SysResourcesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wuzhaoyu
 * @since 2019-03-06
 */
@RestController
@RequestMapping("/contentResources")
public class ResourceController extends AbstractController {


    private static final Logger log = LoggerFactory.getLogger(ResourceController.class);
    @Autowired
    private SysResourcesService sysResourcesService;

    @PostMapping("/queryCondition")
    @ResponseBody
    public ResultMsg userList(@RequestBody JSONObject param) {
        try {
            int current = param.getInteger("current");
            int size = param.getInteger("size");
            Map<String, Object> map = new HashMap<>();
//        SubsidiaryCertificate subsidiaryCertificate = param.getObject ( "data",SubsidiaryCertificate.class );
            Page<SysResources> page = new Page<SysResources>(1, 6);
            List<SysResources> sysResources = sysResourcesService.selectList(new EntityWrapper<>());
            Page<SysResources> list = page.setRecords(sysResources);
            return ResultMsg.success(list);
//        redisUtils.set("test",users);

        } catch (Exception e) {
            return ResultMsg.create(400, e.toString());
        }
    }

}

