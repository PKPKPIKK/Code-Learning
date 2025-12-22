package com.LT.Learning.LV2.oop.ooptest5;

import com.LT.Learning.LV2.oop.ooptest1.DOG;

public class test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.setName("小白");
        d.setAge(5);
        System.out.println(d.getName() + "," + d.getAge());
        d.eat();
    }
}
