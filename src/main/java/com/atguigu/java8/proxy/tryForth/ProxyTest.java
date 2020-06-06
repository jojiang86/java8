package com.atguigu.java8.proxy.tryForth;

import org.junit.Test;

public class ProxyTest {
    @Test
    public void test1(){
        Girl girl = new Wangmeili();
        WangMeiliProxyFactory factory = new WangMeiliProxyFactory(girl);
        Girl proxyGirl = (Girl) factory.newProxyInstance();
        proxyGirl.date();
        proxyGirl.watchMovie();
    }
}
