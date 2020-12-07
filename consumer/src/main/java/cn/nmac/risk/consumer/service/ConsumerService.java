package cn.nmac.risk.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "producer", fallback = ConsumerServiceHystrix.class)
public interface ConsumerService {

    @RequestMapping("/")
    public String hello();
}
