package com.LT.Learning.LV2.finalTest;

public class FinalTest {
    public static void main(String[] args) {
        final int NUMBER = 888;// 定义常量
        System.out.println(NUMBER);
        // NUMBER = 200;无法更改，代码报错。
        //基本数据类型：int、double、char、boolean、long、float
        //变量里记录的真实的数据，不是变量本身
        //final int a = 10;变量里记录的数据无法发生改变
        //引用数据类型：String、int[]、double[]、char[]、boolean[]、long[]、float[]
        //final Student stu = new Student();
        //不可改变的为stu的内存地址，而里面的属性值是可以发生改变的
        final Student stu = new Student("张三",18);
        //stu = new Student();内存地址不可变


    }
}
