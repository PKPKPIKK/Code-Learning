package com.LT.Learning.LV2.extendstest.Test5;

public class Student extends Person {
    String grade;

    public Student() {
        super();
        System.out.println("子类Student的空参构造执行力");
    }

    public Student(String name, int age,String grade) {
        super(name, age);
        this.grade = grade;
        System.out.println("子类Student的带参构造执行力");
    }
}
