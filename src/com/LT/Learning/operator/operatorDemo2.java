package com.LT.Learning.operator;

import java.util.Scanner;

public class operatorDemo2 {
    public static void main(String[] args) {
        //键盘录入三位数
        //获取其的个位，十位，百位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int a = sc.nextInt();
        System.out.println("您输入的数字是：" + a);
        int ge = a % 10;
        int shi = a /10 % 10;
        int bai = a / 100 % 10;
        System.out.println("百位：" + bai);
        System.out.println("十位：" + shi);
        System.out.println("个位：" + ge);

    }
}
