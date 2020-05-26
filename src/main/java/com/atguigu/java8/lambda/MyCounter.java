package com.atguigu.java8.lambda;

@FunctionalInterface
public interface MyCounter<T,R> {
    R count(T t1, T t2);
}
