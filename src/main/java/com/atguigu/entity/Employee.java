package com.atguigu.entity;

import lombok.Data;

import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

/**
 * @author hike97
 * @create 2018-09-05 15:54
 * @desc employee实体类
 **/
@Data
public class Employee implements Comparator<Employee> {

    private String name ;
    private Integer age;
    private char gender;
    private double salary;
    private Status status;
    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Employee(String name, Integer age, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public Employee(String name, Integer age, char gender, double salary, Status status) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
        this.status = status;
    }

    @Override
    public int compare (Employee o1, Employee o2) {
        Collator instance = Collator.getInstance(Locale.CHINA);
        return instance.compare(o1.getName (), o2.getName ());
    }

    public enum Status{
        FREE,
        BUSY,
        VOCATION;
    }
}
