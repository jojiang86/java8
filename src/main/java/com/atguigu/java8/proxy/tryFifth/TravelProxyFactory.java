package com.atguigu.java8.proxy.tryFifth;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TravelProxyFactory implements InvocationHandler {
    private Traveller traveller;

    public TravelProxyFactory(Traveller traveller) {
        this.traveller = traveller;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("请提供身份证！");
        Object result = method.invoke(traveller,args);
        System.out.println("钱已到账！");
        return result;
    }
}
