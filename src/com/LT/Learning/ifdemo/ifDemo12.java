package com.LT.Learning.ifdemo;

import java.util.Scanner;

public class ifDemo12 {
    public static void main(String[] args) {
        // 输入两个整数，判断两个数在第几象限
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();
        if (a > 0 && b > 0) {
            System.out.println("两个数在第一象限");
        } else if (a < 0 && b > 0) {
            System.out.println("两个数在第二象限");
        } else if (a < 0 && b < 0) {
            System.out.println("两个数在第三象限");
        } else if (a > 0 && b < 0) {
            System.out.println("两个数在第四象限");
        } else if (a == 0 && b != 0) {
            System.out.println("两个数在y轴上");
        }else if(a != 0 && b == 0){
            System.out.println("两个数在x轴上");
        }else
            System.out.println("两个数在原点");
    }
}
