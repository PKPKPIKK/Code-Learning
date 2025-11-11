package com.LT.Learning.LV1.ifdemo;

import java.util.Scanner;

public class ifDemo11 {
    public static void main(String[] args) {
        // 键盘录入三个整数，判断是否构成三角形，并判断类型
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int c = sc.nextInt();
        // 判断是否构成三角形
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("构成三角形");
            if (a == b && b == c) {
                System.out.println("等边三角形");
            }else if (a == b || b == c || a == c)
                System.out.println("等腰三角形");
            else if(a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
                System.out.println("直角三角形");
            }else
                    System.out.println("普通三角形");
        }else
            System.out.println("不构成三角形");

        }
    }

