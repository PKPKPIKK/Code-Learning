package com.LT.Learning.LV2.oop.interclass.demo1;

import java.sql.SQLOutput;

public class Outer {
    //int a = 10;
    //static int b = 20;
    static class Inner{
        //public void show(){
//            //要先创建外部类对象，用对象才能调用非静态的成员变量
//            Outer o = new Outer();
//            System.out.println(o.a);
//            //静态成员变量可以直接调用
//            System.out.println(b);
 //       }
        public void show1(){
            System.out.println("非静态内部类被调用了");
        }
        public static void show2(){

            System.out.println("静态内部类被调用了");
        }
    }
}
