package com.jinman.test.dao;

import com.jinman.test.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by fengjinman Administrator on 2018/6/15.
 */
@Mapper
public interface UserMapper {

    User findUserById(int id);
}
