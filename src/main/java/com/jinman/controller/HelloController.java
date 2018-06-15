package com.jinman.controller;

import com.jinman.entity.User;
import com.jinman.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by fengjinman Administrator on 2018/6/15.
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String test(){
        return "you are success!";
    }

    @Resource
    private UserService userService;

    @RequestMapping("/findUser")
    public String test1(){
        User user = userService.findUserById(1);
        System.out.println("user = "+user);
        return "index";
    }
}
