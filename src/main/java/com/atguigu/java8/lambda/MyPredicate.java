package com.atguigu.java8.lambda;

import java.util.List;

@FunctionalInterface  //检查是否是函数式接口
public interface MyPredicate<T> {
    boolean test(T t);
}
