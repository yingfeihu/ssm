package com.cn.service;

import com.cn.domain.User;

/**
 * @Author: 应飞虎
 * @Date: 2020/6/29 16:57
 * @Desc:
 */
public interface UserService {

    void operate();

    User selectById(Long id);


}
