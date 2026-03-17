package com.LT.Learning.LV2.oop.interclass.demo3;

public class test2 {
    public static void main(String[] args) {
        //new 类/接口（）{
        //重写的方法；
        // }
        //接口多态
        //没有名字的成员内部类
       Swim s =  new Swim(){
            @Override
            public void swimming() {
                System.out.println("重写的游泳方法");
            }
        };
       s.swimming();
        new Swim(){
            @Override
            public void swimming() {
                System.out.println("重写的游泳方法");
            }
        }.swimming();
    }
}
