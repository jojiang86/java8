package com.atguigu.java8.proxy.tryAgain;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class WangFamilyProxy implements InvocationHandler {
    Girl girl;

    public WangFamilyProxy(Girl girl){
        this.girl = girl;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("先看看家庭背景");
        Object result = method.invoke(girl,args);
        System.out.println("他有没有动手动脚");
        return result;
    }
}
