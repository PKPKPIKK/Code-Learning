package com.LT.Learning.LV2.oop.abstractdemo2;

public class Fog extends animal{
    public Fog() {
    }

    public Fog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }
}
