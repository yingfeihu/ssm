package com.cn;

import com.cn.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author: 应飞虎
 * @Date: 2020/6/29 17:03
 * @Desc:
 */
@SpringBootTest
public class UserServiceTest {

    @Resource
    private UserService userService;

    @Test
    public void testMethod() {
        userService.operate();
    }
}
