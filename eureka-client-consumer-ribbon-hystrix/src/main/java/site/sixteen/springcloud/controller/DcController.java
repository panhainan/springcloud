package site.sixteen.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import site.sixteen.springcloud.service.ConsumerService;

/**
 * DcController
 *
 * @author panhainan
 * @description
 * @date 2019/3/11 10:50
 */
@RestController
public class DcController {


    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer")
    public String consumer() {
        return consumerService.consumer();
    }
}
