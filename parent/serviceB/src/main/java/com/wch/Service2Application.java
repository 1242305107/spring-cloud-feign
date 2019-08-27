package com.wch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
/**
 * @Author WCH
 * @Date 2019/8/26 10:49
 * @Version 1.0
 */
@EnableFeignClients //开始feignClient
//@EnableDiscoveryClient
@SpringBootApplication
//@EnableCircuitBreaker
public class Service2Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Service2Application.class, args);
    }

    @Bean
    @LoadBalanced//开始客户端负载均衡
    public RestTemplate restTemplate(){
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }
}
