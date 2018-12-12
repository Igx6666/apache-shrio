package com.shiro.service;

import com.shiro.entity.User;
import com.shiro.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 谷鑫 G x
 * @Classname UserService
 * @Describe:
 * @date 2018/12/12 15:06
 */
@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public User findByUsername(String username) {
        return userMapper.findByUsername(username);
    }
}
