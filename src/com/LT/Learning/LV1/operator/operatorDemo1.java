package com.LT.Learning.LV1.operator;

public class operatorDemo1 {
    public static void main(String[] args) {
        System.out.println("整数计算");
        int a = 10;
        int b = 3;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        //小数计算
        //细节：
        //   小数直接参与计算，结果有可能不精确

        System.out.println("小数计算");
        double a1 = 1.1;
        double b1 = 1.01;
        double c1 = a1 + b1;
        double d1 = a1 - b1;
        double e1 = a1 * b1;
        double f1 = a1 / b1;
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
        System.out.println(f1);
        System.out.println(a1 % b1);
    }

}
