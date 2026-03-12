package com.LT.Learning.LV2.oop.abstractdemo1;

public class student extends person{
    public student() {
    }

    public student(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("学习");
    }
}
