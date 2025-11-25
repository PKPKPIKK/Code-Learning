package com.LT.Learning.LV1.practice;

import java.util.Scanner;

public class practiceDemo1 {
    public static void main(String[] args) {
        //求票价
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入头等舱价格：");
        double priceFirst = sc.nextDouble();
        System.out.println("请输入经济舱价格：");
        double priceEconomy = sc.nextDouble();
        System.out.println("请输入当前月份：");
        int month = sc.nextInt();
        extracted(month, priceFirst, priceEconomy);
    }

    private static void extracted(int month, double priceFirst, double priceEconomy) {
        switch (month){
            case 5,6,7,8,9,10:
                System.out.println("头等舱价格：" + priceFirst * 0.9);
                System.out.println("经济舱价格：" + priceEconomy * 0.9);
                break;
            default:
                System.out.println("头等舱价格：" + priceFirst * 0.85);
                System.out.println("经济舱价格：" + priceEconomy * 0.85);
        }
    }
}
