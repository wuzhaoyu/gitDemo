package com.wzy.mapper.system;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.wzy.entity.system.SysResources;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wuzhaoyu
 * @since 2019-03-06
 */
public interface SysResourcesMapper extends BaseMapper<SysResources> {

    /**
     * 分页查询
     * @param page
     * @param sysResources
     * @return
     */
    List<SysResources> queryCondition(Page<SysResources> page, SysResources sysResources);

    /**
     * 分页查询
     * @param sysResources
     * @param sysResources
     * @return
     */
    List<SysResources> queryCondition(SysResources sysResources);

}
