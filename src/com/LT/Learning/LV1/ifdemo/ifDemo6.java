package com.LT.Learning.LV1.ifdemo;

import java.util.Scanner;

public class ifDemo6 {
    public static void main(String[] args) {
        // 输入一个数字，判断这个数字是奇数还是偶数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a = sc.nextInt();
        int result;
        if (a % 2 == 0) {
            System.out.println("偶数");
            result = a/2;
            System.out.println(result);
        } else {
            System.out.println("奇数");
            result = a*3+1;
            System.out.println(result);
        }
    }
}
