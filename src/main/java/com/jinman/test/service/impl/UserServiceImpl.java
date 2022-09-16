package com.jinman.test.service.impl;

import com.jinman.test.dao.UserMapper;
import com.jinman.test.entity.User;
import com.jinman.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fengjinman Administrator on 2018/6/15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserById(int id) {

        return userMapper.findUserById(id);
    }
}
