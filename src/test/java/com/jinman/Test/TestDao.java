package com.jinman.Test;

import com.jinman.SpringbootApplication;
import com.jinman.test.dao.UserMapper;
import com.jinman.test.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by fengjinman Administrator on 2018/6/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= SpringbootApplication.class)
public class TestDao {

    @Resource
    private UserMapper userMapper;

    @Test
    public void test1(){
        int id = 1;
        System.out.println(userMapper);
        User user = userMapper.findUserById(id);
        System.out.println("user = "+user);
    }
}
