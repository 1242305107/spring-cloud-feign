package com.wch.controller;

import com.wch.service.TestA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author WCH
 * @Date 2019/8/26 10:49
 * @Version 1.0
 */
@RestController
public class ControllerB {

    @Autowired
    TestA testA;


    @GetMapping("/get/{id}")
    public String findById(@PathVariable("id") String id) {
        String s = id + "服务B";
        return s;
    }

    @GetMapping("/test/{id}")
    public String test() {
        testA.test();
        return "ok";
    }

    @GetMapping("/testCommon/{id}")
    public String testCommon() {
        testA.testCommon();
        return "ok common";
    }

}
