package com.wch.feign.fallback;

import com.wch.feign.ClientA;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
/**
 * @Author WCH
 * @Date 2019/8/26 10:49
 * @Version 1.0
 */
@Component
public class ClientAFallbackFactory implements FallbackFactory<ClientA>{

    @Override
    public ClientA create(Throwable throwable) {
        return new ClientA() {
            @Override
            public String findById(String id) {
                return "fallback";
            }
        };
    }
}
