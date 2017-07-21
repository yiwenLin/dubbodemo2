package com.tingliao.dubbodemo2.servise.impl;

import com.tingliao.dubbodemo2.servise.TestService;

/**
 * Created by Administrator on 2017/7/21.
 */
public class TestServiseImpl implements TestService {
    public void test() {
        System.out.println("---TestServiceImpl test()----服务被调用----------");
    }

    public String testString(String str) {
        System.out.println("---TestServiceImpl testString("+str+")----服务被调用----------");
        return "还给你："+str;
    }
}
