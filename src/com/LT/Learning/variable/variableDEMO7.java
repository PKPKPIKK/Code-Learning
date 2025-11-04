package com.LT.Learning.variable;

import java.util.Scanner;

public class variableDEMO7 {
    public static void main(String[] args) {
        //键盘录入两个整数并求和
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入一个整数：");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("两个整数的和为：");
        System.out.println(c);

    }

}
