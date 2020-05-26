package com.atguigu.java8.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class TestStreamAPI2 {

    @Test
    public void test1(){
        // [1,2,3,4] ————》[1,4,9,16]
        List<Integer> list = Arrays.asList(1,2,3,4);
        list.stream().map(o->o*o)
                .forEach(System.out::println);
    }

    @Test
    public void test2(){
        // 用map和reduce数一数流中有多少个employee
        List<Employee> list = Arrays.asList(
                new Employee("张三",18,3999.99, Employee.Status.FREE),
                new Employee("李四",25,5666.66, Employee.Status.BUSY),
                new Employee("王五",16,4888.88, Employee.Status.VOCATION),
                new Employee("赵六",37,2333.33, Employee.Status.FREE),
                new Employee("田七",22,8999.99, Employee.Status.FREE),
                new Employee("孙八",60,4333.33, Employee.Status.BUSY)

        );

        Long count = list.stream().count();
        System.out.println(count);

        Optional<Integer> count2 = list.stream().map(o->1).reduce((e1, e2)->e1+e2);
        System.out.println(count2.get());
    }
}
