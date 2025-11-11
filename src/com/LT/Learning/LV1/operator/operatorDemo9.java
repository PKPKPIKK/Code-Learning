package com.LT.Learning.LV1.operator;

import java.util.Scanner;

public class operatorDemo9 {
    public static void main(String[] args) {
        //逻辑运算符
        //1.键盘录入整数，判断是否在1-10之间
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean result = a > 1 && a < 10;
        System.out.println(result);
    }
}
