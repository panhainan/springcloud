package site.sixteen.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import site.sixteen.springcloud.filter.AccessFilter;

@EnableZuulProxy
@SpringBootApplication
public class ZuulApiGateway {

    public static void main(String[] args) {
        SpringApplication.run(ZuulApiGateway.class, args);
    }


    @Bean
    public AccessFilter accessFilter(){
        return new AccessFilter();
    }
}
