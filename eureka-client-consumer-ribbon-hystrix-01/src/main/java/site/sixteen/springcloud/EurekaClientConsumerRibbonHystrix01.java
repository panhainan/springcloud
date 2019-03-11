package site.sixteen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@EnableHystrix
//@EnableCircuitBreaker
//@EnableEurekaClient
//@SpringBootApplication
@SpringCloudApplication
public class EurekaClientConsumerRibbonHystrix01 {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumerRibbonHystrix01.class, args);
    }

}
