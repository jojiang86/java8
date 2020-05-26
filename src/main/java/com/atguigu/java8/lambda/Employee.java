package com.atguigu.java8.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private String name;
    private Integer age;
    private Double salary;

    public Employee(Integer age) {
        this.age = age;
    }

    public Employee(Integer age, String name) {
        this.age = age;
        this.name = name;
    }
}
