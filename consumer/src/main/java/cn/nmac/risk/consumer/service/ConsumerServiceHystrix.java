package cn.nmac.risk.consumer.service;

import org.springframework.stereotype.Component;

@Component
public class ConsumerServiceHystrix implements ConsumerService {

    @Override
    public String hello() {
        return "sorry, hello service call failed";
    }
}
