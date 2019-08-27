package com.wch.feign;

import com.wch.feign.fallback.ClientACommonFallbackFactory;
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
@FeignClient(name = "serviceA", fallbackFactory = ClientACommonFallbackFactory.class)
public interface ClientAA {

    @GetMapping("/get/{id}")
    public String findById(@PathVariable("id") String id);

}
