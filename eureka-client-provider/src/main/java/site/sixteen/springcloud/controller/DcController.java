package site.sixteen.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author 十六 (@email panhainan@yeah.net)
 * @date 2019/3/9 15:59
 */
@Slf4j
@RestController
public class DcController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/services")
    public List<String> services() throws InterruptedException {
        Thread.sleep(5000L);
        List<String> services = discoveryClient.getServices();
        log.info("【延迟】services:{}", services);
        return services;
    }
}
