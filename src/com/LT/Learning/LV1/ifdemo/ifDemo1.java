package com.LT.Learning.LV1.ifdemo;

public class ifDemo1 {
    public static void main(String[] args) {
      // 定义一个体温变量，判读是否超出温度界限
        double temp = 37.5;
        if (temp >= 37.5) {
            System.out.println("请自我隔离");
        } else {
            System.out.println("请继续工作");
        }
    }
}
