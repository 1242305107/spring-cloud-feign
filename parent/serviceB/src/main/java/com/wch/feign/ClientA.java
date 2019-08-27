package com.wch.feign;

import com.wch.feign.fallback.ClientAFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 * @Author WCH
 * @Date 2019/8/26 10:49
 * @Version 1.0
 */
@FeignClient(name = "serviceA", fallbackFactory = ClientAFallbackFactory.class)
public interface ClientA {

    //@RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    @GetMapping("/get/{id}")
    public String findById(@PathVariable("id") String id);

}
