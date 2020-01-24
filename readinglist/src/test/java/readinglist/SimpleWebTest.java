package readinglist;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ReadingListApplication.class)
@WebIntegrationTest("server.port.=0")
public class SimpleWebTest
{
    @Test(expected = HttpClientErrorException.class)
    public void pageNotFound() {
        try{
            RestTemplate restTemplate = new RestTemplate();

            restTemplate.getForObject("http://localhost:8081/bogusPage",String.class);
            fail("Should result in Http 404");

        }catch(HttpClientErrorException e)
        {
            assertEquals(HttpStatus.NOT_FOUND, e.getStatusCode());
            throw e;
        }
    }
}
