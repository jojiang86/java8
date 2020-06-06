package com.atguigu.java8.proxy.tryThird;

import org.junit.Test;

import javax.swing.*;
import java.lang.reflect.Proxy;

public class ProxyTest {
    @Test
    public void test1(){
        Girl girl = new LadyMarry();
        LadyMarryProxy family = new LadyMarryProxy(girl);
        Girl mother = (Girl) family.getProxyInstance();
        mother.date();
        mother.watchMovie();

    }

    @Test
    public void test2(){
        int i= 0;
        if (i == 0)
            System.out.println("hello");
        System.out.println("hi");
    }
}
