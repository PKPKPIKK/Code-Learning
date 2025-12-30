package com.LT.Learning.LV2.extendstest.Test7;

public class MasterStudent extends Student {
    public MasterStudent() {
        super();
    }
    public MasterStudent(String name, int age, String grade) {
        super(name, age, grade);
    }
    @Override
    public void study() {
        System.out.println("正在学习本科内容");
    }

    @Override
    public void sleep() {
        System.out.println("在豪华宿舍睡觉");
    }
}
