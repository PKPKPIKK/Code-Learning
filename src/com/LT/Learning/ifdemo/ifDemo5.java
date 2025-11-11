package com.LT.Learning.ifdemo;

import java.util.Scanner;

public class ifDemo5 {
    public static void main(String[] args) {
    // 订外卖，一个平台A满30-10；平台B全场九折，判断哪个平台花钱少
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品价格：");
        double a = sc.nextDouble();
        double costA, costB;
        if(a >= 30){
            costA = a - 10;
        }
        else{
            costA = a;
        }
        System.out.println("使用平台A，花费：" + costA);
        costB = a * 0.9;
        System.out.println("使用平台B，花费：" + costB);
        if(costA < costB){
            System.out.println("使用平台A");
        }
        else{
            System.out.println("使用平台B");
        }
    }
}
