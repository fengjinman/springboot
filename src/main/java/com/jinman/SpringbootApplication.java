package com.jinman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
        System.out.println("http://localhost:8089/testStart");
        System.out.println("http://localhost:8089/testDbQuery?id=1");
        System.out.println("http://localhost:8089/testPage");
        System.out.println("http://localhost:8089/testPagePath");
    }
}
