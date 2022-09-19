package com.jinman.reptile.service;

import com.alibaba.fastjson.JSONObject;

public interface ReptileService {

    void asynchronous(String uid);

    int queryPro(String uid);

    JSONObject queryData(String uid);
}
