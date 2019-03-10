package site.sixteen.springcloud.api;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("eureka-client-provider")
public interface DcClient {

    @GetMapping("/services")
    List<String> consumer();

}