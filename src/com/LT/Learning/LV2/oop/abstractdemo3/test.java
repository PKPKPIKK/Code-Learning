package com.LT.Learning.LV2.oop.abstractdemo3;

public class test {
    public static void main(String[] args) {
        Dog d = new Dog("小黑",1);
        d.eat();
        d.swim();
        System.out.println(d.getName() +d.getAge() );
    }
}
