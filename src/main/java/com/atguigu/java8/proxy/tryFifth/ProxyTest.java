package com.atguigu.java8.proxy.tryFifth;

import org.junit.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {
    @Test
    public void test1(){
        //实例化工厂对象，并使持有被代理对象
        TravelProxyFactory proxyFactory = new TravelProxyFactory(new Zhangshuai());
        //实例化代理对象
        Traveller travellerProxy = (Traveller) Proxy.newProxyInstance(
                Zhangshuai.class.getClassLoader(),
                Zhangshuai.class.getInterfaces(),
                proxyFactory);
        //代理调用
        travellerProxy.buyTicket();
        travellerProxy.fly();
    }
}
