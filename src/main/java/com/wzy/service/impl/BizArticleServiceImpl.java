package com.wzy.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import com.wzy.domain.BizArticle;
import com.wzy.mapper.BizArticleMapper;
import com.wzy.service.BizArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wuzhaoyu
 * @since 2019-07-04
 */
@Service
public class BizArticleServiceImpl extends ServiceImpl<BizArticleMapper, BizArticle> implements BizArticleService {

    @Autowired
    private BizArticleMapper mapper;
    @Override
    public Page<BizArticle> queryCondition(Page<BizArticle> page, BizArticle bizArticle) {
        page.setRecords(mapper.queryCondition(page,bizArticle));
        return page;
    }


}
