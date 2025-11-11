package com.LT.Learning.LV1.operator;

import java.util.Scanner;

public class operatorDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        //判断一个数是否是回文数
        int ge = a%10;
        int shi = a/10%10;
        int bai = a/100%10;
        int qian = a/1000%10;
        boolean result = ge == qian && shi == bai;
        System.out.println(result);

    }
}
