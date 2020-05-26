package com.atguigu.java8.lambda;

public class MyPredicateAge implements MyPredicate<Employee> {

    @Override
    public boolean test(Employee employee) {
        return employee.getAge()>=15;
    }
}
