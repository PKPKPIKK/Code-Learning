package com.LT.Learning.LV2.oop.ooptest1;

public class TEST
{
    public static void main(String[] args) {
        DOG d1 = new DOG(); //创建第一只小狗
        // 给其中的变量赋值
        d1.name = "小白";
        d1.age = 2;
        d1.weight = 3.5;
        d1.cloor = "白色";
        // 输出小狗一的信息
        System.out.println(d1.name);
        System.out.println(d1.age);
        System.out.println(d1.weight);
        System.out.println(d1.cloor);
    }
}
