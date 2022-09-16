package com.jinman.reptile;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReptileController {

    @ResponseBody
    @RequestMapping("/reptile")
    public Object reptile(String uid) {

        String url = "https://www.weibo.com/ajax/statuses/mymblog?uid=5593532821&page=1&feature=0";
        System.out.println("爬虫条件uid = " + uid);
        System.out.println("爬虫根路径url = " + url);

        // 登录微博的问题

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("msg", "正在爬虫...");
        jsonObject.put("uid", uid);
        return jsonObject;
    }

    @RequestMapping("/reptilePage")
    public String reptilePage() {
        return "reptile/reptile";
    }
}
