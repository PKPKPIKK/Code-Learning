package com.LT.Learning.variable;

import java.util.Scanner;

public class variableDemo8 {
    public static void main(String[] args) {
        //键盘录入人的体重
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();
        //键盘录入人的身高
        System.out.println("请输入身高：");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI指数为：" + String.format("%.2f", bmi));
    }
}
