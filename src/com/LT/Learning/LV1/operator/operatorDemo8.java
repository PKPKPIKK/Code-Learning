package com.LT.Learning.LV1.operator;

import java.util.Scanner;

public class operatorDemo8 {
    public static void main(String[] args) {
        //1.录入两个数字比大小
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + "大于" + b);
        } else if (a < b) {
            System.out.println(a + "小于" + b);
        } else {
            System.out.println(a + "等于" + b);
        }
        //2.输入一个数能否被3整除
        System.out.println("请输入一个数字：");
        int c = sc.nextInt();
        if (c % 3 == 0) {
            System.out.println(c + "可以被3整除");
        } else {
            System.out.println(c + "不能被3整除");
        }

    }
}
