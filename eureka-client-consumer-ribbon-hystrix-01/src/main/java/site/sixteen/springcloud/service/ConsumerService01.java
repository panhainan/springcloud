package site.sixteen.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * ConsumerService
 *
 * @author panhainan
 * @description
 * @date 2019/3/11 10:51
 */
@Component
public class ConsumerService01 {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer01() {
        return restTemplate.getForObject("http://eureka-client-provider/services", String.class);
    }

    public String fallback() {
        return "【服务降级-01】fallback";
    }

}
