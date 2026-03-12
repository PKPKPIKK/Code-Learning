package com.LT.Learning.LV2.oop.abstractdemo1;

public abstract class person {
    private String name;
    private int age;
    public abstract void work();
    public person() {
    }
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
