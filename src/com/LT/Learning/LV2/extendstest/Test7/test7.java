package com.LT.Learning.LV2.extendstest.Test7;

public class test7 {
    public static void main(String[] args) {
        BeachloerStudent s1 = new BeachloerStudent("秦东",18,"大一");
        System.out.println(s1.getName()+s1.getAge()+s1.getGrade());
        s1.eat();
        s1.study();
        s1.sleep();
    }
}
