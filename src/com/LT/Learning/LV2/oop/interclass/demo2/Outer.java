package com.LT.Learning.LV2.oop.interclass.demo2;

public class Outer {
    int b = 20;
    public void show(){
        int a = 10;
        //局部内部类
        class Inner{
            String name;
            int age;
            public void method1(){
                System.out.println("局部内部类中的method1方法");
                System.out.println(a);
                System.out.println(b);
            }
            public  static void method2(){
                System.out.println("局部内部类中的静态method2方法");
            }
        }

        //创建对象方位局部内部类的成员
        Inner i = new Inner();
        System.out.println(i.age);
        System.out.println(i.name);
        i.method1();
        Inner.method2();

    }
}
