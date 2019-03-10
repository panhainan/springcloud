package site.sixteen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurakaServer01 {

    public static void main(String[] args) {
        SpringApplication.run(EurakaServer01.class, args);
    }

}
