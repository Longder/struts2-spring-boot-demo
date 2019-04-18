package com.longder.demo.service.impl;

import com.longder.demo.service.TestService;
import org.springframework.stereotype.Service;

/**
 * Created by Longder
 */
@Service
public class TestServiceImpl implements TestService {
    public void test() {
        System.out.println("测试Service方法");
    }
}
