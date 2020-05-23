package com.atguigu.java8;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class LambdaTest1 {

    private List<Employee> employees;

    @Before
    public void before() {
        employees = Arrays.asList(
                new Employee("张三", 18, 999.99),
                new Employee("李四", 16, 666.66),
                new Employee("王五", 12, 777.77),
                new Employee("赵六", 8, 999.99),
                new Employee("田七", 18, 888.88)
        );
    }

    @Test
    public void test1() {
        Comparator<Integer> compare = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };
        TreeSet set = new TreeSet(compare);
    }

    @Test
    public void test2() {
        Comparator<Integer> comparator = (o1, o2) -> Integer.compare(o1, o2);
        TreeSet set = new TreeSet(comparator);
    }

    /**
     * 优化方式一
     * 使用策略模式，进行不同需求的筛选
     * 好处是，不用写太多方法，方法里许多重复代码
     * 坏处是，每新增一个筛选需求，都要新增一个类
     */
    @Test
    public void test3() {

        // 要筛选出年龄大于15的人
        List<Employee> emp1s = filterEmployee(employees, new MyPredicateAge());

        // 要筛选出工资大于700的人
        List<Employee> emp2s = filterEmployee(employees, new MyPredicateSalary());

        emp1s.forEach(System.out::println);
        System.out.println("**********************");
        emp2s.forEach(System.out::println);
    }

    private List<Employee> filterEmployee(List<Employee> employees, MyPredicate<Employee> mp) {
        List<Employee> result = new ArrayList<>();
        for (Employee emp : employees) {
            if (mp.test(emp)) {
                result.add(emp);
            }
        }
        return result;
    }



    /**
     * 优化方式二
     * 匿名内部类
     * 比test3好在，不用写类
     * 坏处是，匿名内部类本身，冗余代码存在
     */
    @Test
    public void test4() {
        List<Employee> result = filterEmployee(employees, new MyPredicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge()>=15;
            }
        });
        result.forEach(System.out:: println);
    }

    /**
     * 优化方式三
     * lambda表达式，写匿名内部类，提取核心代码
     */
    @Test
    public void test5() {
        List<Employee> result = filterEmployee(employees, (e) -> e.getAge()>=15);
        result.forEach(System.out:: println);
    }

    /**
     * 优化方式四
     * stream API
     */
    @Test
    public void test6() {
        employees.stream()
                .filter((e) -> e.getAge()>=15)
                .forEach(System.out::println);
    }
}
