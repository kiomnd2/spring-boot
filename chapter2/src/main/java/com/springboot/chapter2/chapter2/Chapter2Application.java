package com.springboot.chapter2.chapter2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //컴포넌트 컴색과 자동 구성 활성화
public class Chapter2Application {
    //애플리케이션 부트스트랩
    public static void main(String[] args) {
        SpringApplication.run(Chapter2Application.class, args);
    }

}
