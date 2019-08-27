package com.wch.feign.fallback;

import com.wch.feign.ClientAA;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
/**
 * @Author WCH
 * @Date 2019/8/26 10:49
 * @Version 1.0
 */
@Component
public class ClientACommonFallbackFactory implements FallbackFactory<ClientAA>{

    @Override
    public ClientAA create(Throwable throwable) {
        return new ClientAA() {
            @Override
            public String findById(String id) {
                return "fallback  common";
            }
        };
    }
}
