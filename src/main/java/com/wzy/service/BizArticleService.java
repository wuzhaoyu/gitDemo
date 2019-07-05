package com.wzy.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.wzy.domain.BizArticle;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wuzhaoyu
 * @since 2019-07-04
 */
public interface BizArticleService extends IService<BizArticle> {
    /**
     * 分页查询
     * @param page
     * @param bizArticle
     * @return
     */
    Page<BizArticle> queryCondition(Page<BizArticle> page, BizArticle bizArticle);
}
