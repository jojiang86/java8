package com.atguigu.java8.proxy.tryThird;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LadyMarryProxy implements InvocationHandler {
    private Girl girl;

    public LadyMarryProxy(Girl girl){
        this.girl = girl;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        System.out.println("先看看");
        result = method.invoke(girl,args);
        System.out.println("再问问");
        return result;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(girl.getClass().getClassLoader(),girl.getClass().getInterfaces(),this);
    }
}
