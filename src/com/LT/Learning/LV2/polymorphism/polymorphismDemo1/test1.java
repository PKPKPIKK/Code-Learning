package com.LT.Learning.LV2.polymorphism.polymorphismDemo1;

public class test1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("秦东");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("张三");
        t.setAge(38);


       Administrator a = new Administrator();
        a.setName("李四");
        a.setAge(48);

        register(s);
        register(t);
        register(a);
    }
    //这个方法可以接收老师、学生、管理员
    //只能把参数写成这三个参数的父类
    public static void register(Person p){
        p.show();
    }
}
