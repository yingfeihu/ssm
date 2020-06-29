package com.cn;

import com.cn.domain.User;
import com.cn.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: 应飞虎
 * @Date: 2020/6/29 17:58
 * @Desc:
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/hello")
    public String hello() {
        User user = userService.selectById(1L);
        return user.toString();
    }
}
