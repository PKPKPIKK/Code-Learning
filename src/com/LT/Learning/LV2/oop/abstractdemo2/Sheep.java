package com.LT.Learning.LV2.oop.abstractdemo2;

public class Sheep extends animal{
    public Sheep() {
    }

    public Sheep(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("山羊在吃植物");
    }
}
