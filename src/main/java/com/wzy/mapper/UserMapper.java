package com.wzy.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.wzy.entity.User;

import java.util.List;

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

    List<User> selectCondition();
}
