package com.wzy.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.wzy.domain.BizArticle;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wuzhaoyu
 * @since 2019-07-04
 */
public interface BizArticleMapper extends BaseMapper<BizArticle> {
    /**
     * 分页查询
     * @param page
     * @param bizArticle
     * @return
     */
    List<BizArticle> queryCondition(Pagination page, BizArticle bizArticle);
}
