package site.sixteen.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 十六 (@email panhainan@yeah.net)
 * @date 2019/3/10 19:29
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${info}")
    private String info;

    @RequestMapping("/adc")
    public String test(){
        return info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
