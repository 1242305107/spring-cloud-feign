package com.wch.service;

import com.wch.feign.ClientA;
import com.wch.feign.ClientAA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
/**
 * @Author WCH
 * @Date 2019/8/26 10:49
 * @Version 1.0
 */
@Service
public class TestA {

    @Autowired
    ClientA clientA;

    @Autowired
    ClientAA clientAA;


    public void test(){
        String test = clientA.findById("test");
        System.out.println(test);
    }

    public void testCommon(){
        String test = clientAA.findById("test common");
        System.out.println(test);
    }


}
