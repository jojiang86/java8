package com.atguigu.java8.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class WangFamilyProxy implements InvocationHandler {
    Girl girl;

    public WangFamilyProxy(Girl girl){
        super();
        this.girl = girl;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        if(method.getName().equals("date")){
            result = method.invoke(girl,args);
            System.out.println("先调查一下他的背景。。。");
            System.out.println("他有没有动手动脚。。。");
        }
        return result;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(girl.getClass().getClassLoader(),girl.getClass().getInterfaces(),this);
    }
}
