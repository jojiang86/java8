package com.atguigu.java8.proxy.tryAgain;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {
    @Test
    public void test1(){
        Girl girl = new Wangmeili();
        WangFamilyProxy wangFamilyProxy = new WangFamilyProxy(girl);
        Girl mother = (Girl) Proxy.newProxyInstance(girl.getClass().getClassLoader(),girl.getClass().getInterfaces(),wangFamilyProxy);
        mother.date();
        mother.watchMovie();
    }
}
