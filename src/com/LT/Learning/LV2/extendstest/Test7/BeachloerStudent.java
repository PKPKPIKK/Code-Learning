package com.LT.Learning.LV2.extendstest.Test7;

public class BeachloerStudent extends Student {
    @Override
    public void study() {
        System.out.println("学习本科内容");
    }
    public BeachloerStudent() {
        super();
    }
    public BeachloerStudent(String name, int age, String grade) {
        super(name, age, grade);
    }
}
