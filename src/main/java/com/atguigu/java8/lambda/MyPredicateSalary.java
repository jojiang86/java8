package com.atguigu.java8.lambda;


public class MyPredicateSalary implements MyPredicate<Employee> {

    @Override
    public boolean test(Employee employee) {
        return employee.getSalary()>=700;
    }
}
