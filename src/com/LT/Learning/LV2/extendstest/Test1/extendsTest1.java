package com.LT.Learning.LV2.extendstest.Test1;

public class extendsTest1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "TT";
        s.age = 18;
        s.grand = "一年级";
        s.eat();
        s.Study();
        Teacher t = new Teacher();
        t.name = "kk";
        t.age = 18;
        t.subject = "数学";
        t.eat();
        t.Teach();
    }
}
