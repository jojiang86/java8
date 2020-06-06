package com.atguigu.java8.proxy.tryForth;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class WangMeiliProxyFactory implements InvocationHandler {
    Girl girl;

    public WangMeiliProxyFactory(Girl girl) {
        this.girl = girl;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("先看看");
        Object result = method.invoke(girl,args);
        System.out.println("他有没有动手动脚");
        return result;
    }

    public Object newProxyInstance(){
        return Proxy.newProxyInstance(girl.getClass().getClassLoader(),girl.getClass().getInterfaces(),this);
    }
}
