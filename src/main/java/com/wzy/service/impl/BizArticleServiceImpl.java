package com.wzy.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;

import com.wzy.common.BeanMapUtils;
import com.wzy.common.DateUtils;
import com.wzy.domain.BizArticle;
import com.wzy.mapper.BizArticleMapper;
import com.wzy.service.BizArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.*;

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
    public Page<BizArticle> queryCondition(Page page, BizArticle bizArticle) {
        List<BizArticle> bizArticles = mapper.queryCondition(page, bizArticle);
       page.setRecords(bizArticles);
//        page.setTotal(mapper.queryCondition(bizArticle).size());
        return page;
    }


    @Override
    public List<BizArticle> queryCondition(BizArticle bizArticle) {
        return mapper.queryCondition( bizArticle);
    }

    @Override
    @CacheEvict
    public Map<String, Object> queryRecentSixMonthTotal() {
        Map<String,Object> map  = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format3 = new SimpleDateFormat("yyyy年MM月");
        //获取当前年月前一月
        Date beforeDate = null;
        calendar.add(Calendar.MONTH,1);
        //获取当前年月
        Date date = null;
        for (int i=0;i<6;i++){
            //每次月数减一，如果需要当前月份以后的就填1
            beforeDate =  DateUtils.getMonthFirstDate(calendar.getTime());
            calendar.add(Calendar.MONTH,-1);
            date = DateUtils.getMonthFirstDate(calendar.getTime());
            String format1 = format.format(beforeDate);
            String format2 = format.format(date);
            Long aLong = mapper.queryRecentSixMonthTotal(format2,format1);
            map.put(format3.format(date),aLong);
        }
        System.out.println(map);
        return BeanMapUtils.sortMapByKey(map);
    }

    @Override
    public List<Map<String, Object>> queryAritcleGroupByType() {
        return mapper.queryAritcleGroupByType();
    }

    @Override
    public BizArticle querySingleBizArtcle(BizArticle bizArticle) {
        return mapper.querySingleBizArtcle(bizArticle);
    }


}
