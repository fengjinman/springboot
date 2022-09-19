package com.jinman.reptile.service;

import com.jinman.reptile.ReptileThread;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
@Service
public class ReptileServiceImpl implements ReptileService {

    public static final Map<String, Integer> MAP = new ConcurrentHashMap<>();

    @Override
    public void asynchronous(String uid) {
        String url = "https://www.weibo.com/ajax/statuses/mymblog?uid=5593532821&page=1&feature=0";
        System.out.println("爬虫条件uid = " + uid);
        System.out.println("爬虫根路径url = " + url);
        // 登录微博的问题  进度条

        ReptileThread reptileThread = new ReptileThread(uid);
        MAP.put(uid, 0);
        reptileThread.start();
    }

    @Override
    public int queryPro(String uid) {
        Integer pro = MAP.get(uid);
        if (Objects.nonNull(pro)) {
            return pro;
        }
        return 10000;
    }
}
