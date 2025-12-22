package com.LT.Learning.LV2.oop.ooptest4;

public class test {
    public static void main(String[] args) {
        Cooker c = new Cooker();
        c.name = "张三";
        c.age = 38;
        c.cookLevel = 10;
        System.out.println(c.name);
        System.out.println(c.age);
        System.out.println(c.cookLevel);
        c.cooking();
    }
}
