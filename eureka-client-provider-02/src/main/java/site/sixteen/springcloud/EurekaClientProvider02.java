package site.sixteen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientProvider02 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProvider02.class, args);
    }

}
