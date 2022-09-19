package com.jinman.reptile;

import com.jinman.reptile.service.ReptileServiceImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReptileThread extends Thread {

    double total = 0;

    double pro = 0;

    public ReptileThread(String uid) {
        this.uid = uid;
    }

    String uid;

    @Override
    public void run() {
        String url = "https://www.weibo.com/ajax/statuses/mymblog?uid=5593532821&page=1&feature=0";
        System.out.println("爬虫条件uid = " + uid);
        System.out.println("爬虫根路径url = " + url);
        // 登录微博的问题  进度条

        total = 100;
        for (int i = 0; i < 100; i++) {
            try {
//                System.out.println(i);
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
                log.info("InterruptedException");
            }
            pro++;
            ReptileServiceImpl.MAP.put(uid, genPro());
        }

    }

    /**
     * 计算用double计算实际的百分比  返回用int防止页面样式改变
     * @return
     */
    public int genPro() {
        if (total != 0 && pro != 0) {
            return (int)((pro / total) * 100);
        }
        return 0;
    }
}
