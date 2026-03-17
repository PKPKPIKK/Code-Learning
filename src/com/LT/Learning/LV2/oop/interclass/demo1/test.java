package com.LT.Learning.LV2.oop.interclass.demo1;

public class test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer.Inner();
        oi.show1();
        //只要是静态的东西都可以用类名直接调用
        Outer.Inner.show2();
    }
}
