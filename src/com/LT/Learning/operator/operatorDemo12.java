package com.LT.Learning.operator;

import java.util.Scanner;

public class operatorDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入另一个整数：");
        int b = sc.nextInt();
        int result = a > b ? a : b;
        System.out.println(result);
    }
}
