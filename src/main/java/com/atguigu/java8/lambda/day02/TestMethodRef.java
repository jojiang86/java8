package com.atguigu.java8.lambda.day02;

import com.atguigu.java8.lambda.Employee;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;

/**
 * 一.方法引用：如果lambda体中的逻辑已经实现了，可以使用“方法引用”
 * 使用注意：lambda体中已经实现的方法的对象+返回值，必须与调用接口的对象+返回值保持一致
 * <p>
 * 三种格式：
 * 1.对象::实例方法名
 * 2.类::静态方法名
 * 3.类::实例方法名
 *
 * lambda的本质是（特殊写法的）实例化接口对象，作为一个处理器对象，
 * 使用lambda的过程即是一种设计模式：定义接口，实现接口（lambda），调用，
 * 方法引用，本质是已经实现过一次的接口（处理器对象，处理逻辑），给另一个处理器复用
 */
public class TestMethodRef {

    @Test
    public void test1() {
        //对象::实例方法名
        Consumer<Employee> com1 = employee -> System.out.println(employee.getAge());
        Consumer<Employee> com2 = com1:: accept;

        //类::静态方法名
        Comparator<Integer> com3 = (x, y) -> Integer.compare(x, y);
        Comparator<Integer> com4 = Integer::compare;

        //类::实例方法名
        //当实现方法满足：第一个参数是调用者，第二个参数是方法参数，可以这么写
        BiPredicate<String,String> com5 = (x,y)->x.equals(y);
        BiPredicate<String,String> com6 = String::equals;

    }
}
