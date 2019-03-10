package site.sixteen.springcloud.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author 十六 (@email panhainan@yeah.net)
 * @date 2019/3/10 0:59
 */
@RestController
public class DcController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer")
    public List dc(){
        return restTemplate.getForObject("http://eureka-client-provider-01/services", List.class);
    }
}
