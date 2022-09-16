package com.jinman.controller;

import com.alibaba.fastjson.JSONObject;
import com.jinman.entity.User;
import com.jinman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by fengjinman Administrator on 2018/6/15.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/testStart")
    @ResponseBody
    public Object testStart() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code",200);
        jsonObject.put("msg","you are success!");
        return jsonObject;
    }

    @ResponseBody
    @RequestMapping("/testDbQuery")
    public Object testDbQuery(Integer id) {
        return userService.findUserById(id);
    }

    @RequestMapping("/testPage")
    public String testPage() {
        return "index";
    }

    @RequestMapping("/testPagePath")
    public String testPagePath() {
        return "pkg/pkg";
    }
}
