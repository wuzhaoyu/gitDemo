package com.wzy.service.system.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wzy.mapper.UserMapper;
import com.wzy.entity.User;
import com.wzy.service.system.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/2/21
 * 修改说明
 * <p>Title: UserServiceImpl.java</p>
 *
 * @author Wzy
 * @version V1.0
 **/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> selectCondition() {
        return userMapper.selectCondition();
    }
}
