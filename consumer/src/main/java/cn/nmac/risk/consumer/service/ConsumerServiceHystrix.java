package cn.nmac.risk.consumer.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class ConsumerServiceHystrix implements ConsumerService {

    @RequestMapping("/")
    public String hello() {
        return "sorry, hello service call failed";
    }
}
