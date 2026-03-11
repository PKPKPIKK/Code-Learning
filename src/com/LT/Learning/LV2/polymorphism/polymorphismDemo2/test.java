package com.LT.Learning.LV2.polymorphism.polymorphismDemo2;

public class test {
    public static void main(String[] args) {
        Person p1 = new Person(30,"老王");
        Dog d = new Dog(2,"黑");
        p1.keepPet(d,"骨头");
        Person p2 = new Person(25,"老李");
        Cat c = new Cat(3,"灰");
        p2.keepPet(c,"鱼");
    }
}
