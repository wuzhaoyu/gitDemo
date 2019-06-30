package com.wzy.service.system;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.wzy.entity.system.User;

import java.util.List;
import java.util.Map;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/2/21
 * 修改说明
 * <p>Title: UserService.java</p>
 *
 * @author Wzy
 * @version V1.0
 **/
public interface UserService extends IService<User> {

    Page<Map<String,Object>> selectCondition(Page<Map<String,Object>> page, Map<String,Object> map);
}
