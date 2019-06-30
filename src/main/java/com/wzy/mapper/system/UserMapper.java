package com.wzy.mapper.system;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.wzy.entity.system.User;

import java.util.List;
import java.util.Map;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/2/21
 * 修改说明
 * <p>Title: UserMapper.java</p>
 *
 * @author Wzy
 * @version V1.0
 **/
public interface UserMapper extends BaseMapper<User> {

    List<Map<String,Object>> selectCondition(Map<String,Object> map);
}
