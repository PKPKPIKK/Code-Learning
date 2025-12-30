package com.LT.Learning.LV2.extendstest.Test5;

public class Teacher extends Person{
    String subject;

    public Teacher() {
        System.out.println("子类Teacher的空参构造执行力");
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("子类Teacher的带参构造执行力");
    }
}
