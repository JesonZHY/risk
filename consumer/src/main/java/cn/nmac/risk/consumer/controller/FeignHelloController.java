package cn.nmac.risk.consumer.controller;

import cn.nmac.risk.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignHelloController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/feign/call")
    public String call() {
        return consumerService.hello();
    }
}
