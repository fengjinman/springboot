package com.jinman.reptile.service;

import com.jinman.reptile.ReptileThread;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ReptileServiceImpl implements ReptileService {

    public static int TOTAL = 0;

    public static int PRO = 0;

    @Override
    public void asynchronous(String uid) {
        String url = "https://www.weibo.com/ajax/statuses/mymblog?uid=5593532821&page=1&feature=0";
        System.out.println("爬虫条件uid = " + uid);
        System.out.println("爬虫根路径url = " + url);
        // 登录微博的问题  进度条

        ReptileThread reptileThread = new ReptileThread(uid);
        reptileThread.start();
    }

    @Override
    public double queryPro() {
        if (TOTAL != 0 && PRO != 0) {
            return (double) PRO / TOTAL;
        }
        return 0;
    }
}
