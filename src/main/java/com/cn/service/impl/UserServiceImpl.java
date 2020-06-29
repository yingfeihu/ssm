package com.cn.service.impl;

import com.cn.dao.UserMapper;
import com.cn.domain.User;
import com.cn.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author: 应飞虎
 * @Date: 2020/6/29 16:57
 * @Desc:
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void operate() {
        User user = new User();
        user.setName("aaa");
        user.setPassword("bbb");
        userMapper.insertSelective(user);
        userMapper.deleteByPrimaryKey(1L);
    }

    @Override
    public User selectById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
