package com.atguigu.java8.proxy;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {
    @Test
    public void test1(){
        Girl girl = new Wangmeili();
        WangFamilyProxy family= new WangFamilyProxy(girl);
        Girl mother = (Girl) family.getProxyInstance();
        mother.date();
        mother.watchMovie();

    }
}
