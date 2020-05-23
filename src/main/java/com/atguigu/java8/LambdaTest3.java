package com.atguigu.java8;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaTest3 {
    @Test
    public void test1(){
        List<Employee> employees = Arrays.asList(
                new Employee("张三", 18, 999.99),
                new Employee("李四", 16, 666.66),
                new Employee("王五", 12, 777.77),
                new Employee("赵六", 8, 999.99),
                new Employee("田七", 18, 888.88)
        );

        // 排序，先按年龄升序，后按工资升序
        Collections.sort(employees, (e1, e2) -> {
            if(e1.getAge().equals(e2.getAge())){
                return e1.getSalary().compareTo(e2.getSalary());
            }else {
                return e1.getAge().compareTo(e2.getAge());
            }
        });
        employees.forEach(System.out::println);
    }

    @Test
    public void test2(){
        String message = "abcDefGhiJkL";
        String m1 = getMessage(message, o -> o.substring(1,3));
        String m2 = getMessage(message, o -> o.toUpperCase());
        System.out.println(m1);
        System.out.println(m2);

    }

    private String getMessage(String message, StringHandler handler){
        return handler.getValue(message);
    }

    @Test
    public void test3(){
        Double doub1 = count(15.1, 16.2, (o1,o2)->o1+o2);
        Double doub2 = count(15.1, 16.2, (o1,o2)->o1*o2);
        System.out.println(doub1);
        System.out.println(doub2);
    }

    private Double count(Double d1, Double d2, MyCounter<Double, Double> myCounter){
        return myCounter.count(d1, d2);
    }
}
