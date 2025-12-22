package com.LT.Learning.LV2.oop.ooptest3;

public class test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "LT";
        t.age = 23;
        System.out.println(t.name);
        System.out.println(t.age);
        //行为调用,老师在干活
        t.teach();
        t.eat();
        t.sleep();
    }
}
