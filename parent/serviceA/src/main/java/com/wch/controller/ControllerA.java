package com.wch.controller;

import org.springframework.web.bind.annotation.*;
/**
 * @Author WCH
 * @Date 2019/8/26 10:49
 * @Version 1.0
 */
@RestController
public class ControllerA {

    @GetMapping("/get/{id}")
    public String findById(@PathVariable("id") String id) {
        String s = id + "服务A";
        return s;
    }

}
