package com.wzy.service.system.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wzy.entity.system.SysResources;
import com.wzy.mapper.system.SysResourcesMapper;
import com.wzy.service.system.SysResourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wuzhaoyu
 * @since 2019-03-06
 */
@Service
public class SysResourcesServiceImpl extends ServiceImpl<SysResourcesMapper, SysResources> implements SysResourcesService {

    @Autowired
    private SysResourcesMapper sysResourcesMapper;
    @Override
    public Page<SysResources> queryCondition(Page<SysResources> page, SysResources sysResources) {
        page.setRecords(sysResourcesMapper.queryCondition(page,sysResources));
        return page;
    }

    @Override
    public List<SysResources> queryCondition(SysResources sysResources) {
        return sysResourcesMapper.queryCondition(sysResources);
    }

    @Override
    public void save(SysResources sysResources) {
        if(Objects.isNull(sysResources)){
            return;
        }
        sysResources.setCreatedBy(1);
        if(Objects.nonNull(sysResources.getTid())){
            sysResources.setUpdatedAt(new Date());
            sysResourcesMapper.updateById(sysResources);
        }else{
            sysResources.setCreatedAt(new Date());
            sysResourcesMapper.insert(sysResources);
        }
    }
}
