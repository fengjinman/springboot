package com.jinman.reptile.controller;

import com.alibaba.fastjson.JSONObject;
import com.jinman.reptile.service.ReptileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReptileController {

    @Autowired
    ReptileService reptileService;

    /**
     * 异步接口，接收信息之后开始异步爬取数据，直接返还成功 拿到url列表之后维护进度条list
     * @param uid
     * @return
     */
    @ResponseBody
    @RequestMapping("/reptile/start")
    public Object reptile(String uid) {

        reptileService.asynchronous(uid);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("uid", uid);
        return jsonObject;
    }

    @RequestMapping("/reptilePage")
    public String reptilePage() {
        return "reptile/reptile";
    }

    @ResponseBody
    @RequestMapping("/reptile/queryPro")
    public Object queryPro(String uid) {
        int pro = reptileService.queryPro(uid);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("pro", pro);
        return jsonObject;
    }
}
