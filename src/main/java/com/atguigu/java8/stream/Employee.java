package com.atguigu.java8.stream;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {
    private String name;
    private Integer age;
    private Double salary;
    private Status status;

    public Employee(String name, Integer age, Double salary, Status status) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", status=" + status +
                '}';
    }

    public enum Status{
        FREE,
        BUSY,
        VOCATION;
    }
}
