package com.atguigu.java8.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * 一.lambda表达式基础语法：
 * 1.jdk8新增 -> 操作符，将分为左右两侧
 * 2.左侧，操作的参数，对应接口中抽象方法的参数列表
 * 3.右侧，lambda体，对应接口方法的实现逻辑
 *
 * 格式一：无参 无返回值：()->System.out.println("hello")
 *        如：Runnable()
 *
 * 格式二：一个参数  无返回值:(x) -> System.out.println(x)
 *         如：Consumer()
 *
 * 格式三：多个参数  有返回值  有多条语句：(x,y) -> {语句1；语句2};
 *          如：Compare()
 *
 * 格式四：只有一条语句：(x,y) -> 语句1;  {}和return可一起省略
 *
 * 格式五：参数类型可不写，类型推断
 *
 *
 * 二.lambda表达式需要函数时接口的支持（即先定义一个接口，里面只有一个抽象方法）
 */
public class LambdaTest2 {

    @Test
    public void test1(){
        Runnable runnable = () -> System.out.println("hello");
        runnable.run();
    }

    @Test
    public void test2(){
        Consumer<String> com = (x) -> System.out.println(x);
        com.accept("hello");
    }

    @Test
    public void test3(){
        Comparator<Integer> com = (x,y) -> {
            System.out.println("hello");
            return Integer.compare(x,y);
        };
        com.compare(1,2);
    }
}
