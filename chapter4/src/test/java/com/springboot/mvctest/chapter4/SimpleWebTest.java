package com.springboot.mvctest.chapter4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=Chapter4Application.class)
@WebIntegrationTest(randomPort = true)
public class SimpleWebTest {

    @Value("${local.server.port}")
    private int port;

    @Test(expected= HttpClientErrorException.class)
    public void pageNotFount()
    {
        try{

            RestTemplate rest = new RestTemplate();

            //get 요청 수행
            rest.getForObject("http://localhost:{port}/bogusPage",String.class, port);
            fail("Should result in HTTP 404");
        }catch (HttpClientErrorException e ) {
            assertEquals(HttpStatus.NOT_FOUND, e.getStatusCode());
            throw e;
        }

    }
}
