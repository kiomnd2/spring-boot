package com.springboot.mvctest.chapter4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Chapter4Application.class)
@WebAppConfiguration
public class Chapter4ApplicationTests {

    @Test
    public void contextLoads() {
    }

}
