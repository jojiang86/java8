package com.atguigu.java8.day02;

import com.atguigu.java8.Employee;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 构造器引用
 * 若lambda体中只有new一个对象，可以用构造器引用
 * 构造方法参数+返回体，匹配接口参数+返回体
 */
public class TestConstRef {
    @Test
    public void test1(){
        //无参构造，返回一个对象
        Supplier<Employee> sup = ()->new Employee();
        Supplier<Employee> sup2 = Employee::new;
        System.out.println(sup);
        System.out.println(sup2);

        //一个参数构造
//        Function<Integer,Employee> sup3 = (x)->new Employee(x);
        Function<Integer,Employee> sup4 = Employee::new;

        //两个参数构造
        BiFunction<Integer,String,Employee> sup5 = Employee::new;
    }
}
