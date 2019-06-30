package com.wzy.service.system;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.wzy.entity.system.SysResources;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wuzhaoyu
 * @since 2019-03-06
 */
public interface SysResourcesService extends IService<SysResources> {

    /**
     * 分页查询
     * @param page
     * @param sysResources
     * @return
     */
    Page<SysResources> queryCondition(Page<SysResources> page,SysResources sysResources);

    /**
     * 分页查询
     * @param sysResources
     * @param sysResources
     * @return
     */
    List<SysResources> queryCondition(SysResources sysResources);

    /**
     * 保存
     * @param sysResources
     */
    void save(SysResources sysResources);

}
