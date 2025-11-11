package com.LT.Learning.LV1.ifdemo;

import java.util.Scanner;

public class ifDemo7 {
    public static void main(String[] args) {
        /*
        满10-8
        满50-30
        满100-50
        满200-90
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入商品价格：");
        double a = sc.nextDouble();
        double resultA;
        Double resultB;
        if (a < 10) {
            resultA = a;
        } else if ( a < 50) {
                resultA = a - 8;
            } else if (a < 100) {
                resultA = a - 30;
            } else if ( a < 200) {
                resultA = a - 50;
            } else {
                resultA = a - 90;
            }
            System.out.println(resultA);
            resultB = a * 0.8;
            System.out.println(resultB);
            if (resultA < resultB) {
                System.out.println("使用优惠券,价更低");
            } else {
                System.out.println("使用平台，价更低");
            }

    }
}
