package site.sixteen.springcloud;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableSwagger2Doc
@EnableEurekaClient
@SpringBootApplication
public class EurekaClientProvider {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientProvider.class, args);
    }

}
