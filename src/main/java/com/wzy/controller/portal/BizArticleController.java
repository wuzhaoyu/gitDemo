package com.wzy.controller.portal;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;
import com.wzy.common.ResultMsg;
import com.wzy.controller.system.AbstractController;
import com.wzy.domain.BizArticle;
import com.wzy.domain.SysContent;
import com.wzy.service.BizArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author wuzhaoyu
 * @since 2019-07-04
 */
@Controller
@RequestMapping("/bizArticle")
public class BizArticleController extends AbstractController {

    private static final Logger log = LoggerFactory.getLogger(BizArticleController.class);

    @Autowired
    private BizArticleService bizArticleService;

    /**
     * 文章列表
     * @param modal
     * @return
     */
    @PostMapping("/grid")
    public ModelAndView grid(ModelAndView modal){
        try{
            int current =1;
            int size = 6;
            Map<String, Object> map = new HashMap<>();
            BizArticle bizArticle = new BizArticle();
            Page<BizArticle> page = new Page<BizArticle>(current, size);
            Page<BizArticle> sysResources = bizArticleService.queryCondition(page,bizArticle);
            modal.addObject("resources",sysResources.getRecords());
            modal.setViewName("portal/grid");
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return modal;
    }
    @PostMapping("/queryCondition")
    @ResponseBody
    public ResultMsg queryCondition(@RequestBody JSONObject param) {
        try {
            int current = param.getInteger("current");
            int size = param.getInteger("size");
            BizArticle bizArticle = new BizArticle();
            Page<BizArticle> page = new Page<>(current, size);
            Page<BizArticle> sysResources = bizArticleService.queryCondition(page,bizArticle);
            return ResultMsg.success(sysResources);
        } catch (Exception e) {
            return ResultMsg.create(400, e.toString());
        }
    }
    /**
     * 查询文章详情
     * @param tid
     * @return
     */
    @RequestMapping("/singlePost/{tid}")
    public ModelAndView singlePost(@PathVariable Integer tid){
        ModelAndView modal = new ModelAndView();
        try{
            BizArticle bizArticles = bizArticleService.selectById(tid);
            modal.addObject("detail",bizArticles);
            modal.setViewName("portal/single-post");
        }catch (Exception e){
            log.error(e.getMessage());
        }
        return modal;
    }

}

