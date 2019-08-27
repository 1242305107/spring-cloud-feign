package com.wch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;
/**
 * @Author WCH
 * @Date 2019/8/26 10:49
 * @Version 1.0
 */
@EnableFeignClients //开始feignClient
@EnableDiscoveryClient //一个EurekaClient从EurekaServer发现服务
@SpringBootApplication
//@EntityScan("")//扫描实体类
//@ComponentScan(basePackages={""})//扫描接口
//@ComponentScan(basePackages={""})//扫描common包下的类
//@ComponentScan(basePackages={""})//扫描本项目下的所有类
public class Service1Application {
    public static void main(String[] args) {
        SpringApplication.run(Service1Application.class,args);
    }

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }

}