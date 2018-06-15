package com.jinman.service.impl;

import com.jinman.dao.UserDao;
import com.jinman.entity.User;
import com.jinman.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by fengjinman Administrator on 2018/6/15.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User findUserById(int id) {

        return userDao.findUserById(id);
    }
}
