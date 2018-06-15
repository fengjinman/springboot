package com.jinman.dao;

import com.jinman.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by fengjinman Administrator on 2018/6/15.
 */

public interface UserDao {

    User findUserById(int id);
}
