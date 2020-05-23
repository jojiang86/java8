package com.atguigu.java8;

public class MyPredicateAge implements MyPredicate<Employee> {

    @Override
    public boolean test(Employee employee) {
        return employee.getAge()>=15;
    }
}
