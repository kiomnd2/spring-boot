package com.springboot.chapter2.chapter2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

@SpringBootApplication //컴포넌트 컴색과 자동 구성 활성화
public class Chapter2Application  extends WebMvcConfigurerAdapter {
    //애플리케이션 부트스트랩
    public static void main(String[] args) {
        SpringApplication.run(Chapter2Application.class, args);
    }


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        argumentResolvers.add(new ReaderHandlerMethodArgumentResolver());
    }

}
