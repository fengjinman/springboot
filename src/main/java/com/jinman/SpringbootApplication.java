package com.jinman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
        System.out.println("默认首页");
        System.out.println("http://localhost:8089");
        System.out.println("测试启动成功");
        System.out.println("http://localhost:8089/testStart");
        System.out.println("测试查询数据库");
        System.out.println("http://localhost:8089/testDbQuery?id=1");
        System.out.println("测试访问页面");
        System.out.println("http://localhost:8089/testPage");
        System.out.println("测试页面包路径");
        System.out.println("http://localhost:8089/testPagePath");

        System.out.println("爬虫后台功能");
        System.out.println("http://localhost:8089/reptile?uid=5593532821");
        System.out.println("爬虫页面");
        System.out.println("http://localhost:8089/reptilePage");
    }
}
