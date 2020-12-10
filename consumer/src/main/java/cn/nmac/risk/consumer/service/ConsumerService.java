package cn.nmac.risk.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "producer", fallback = ConsumerServiceHystrix.class)
public interface ConsumerService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello();
}
