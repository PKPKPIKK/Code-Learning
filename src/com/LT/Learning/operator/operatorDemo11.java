package com.LT.Learning.operator;

import java.util.Scanner;

public class operatorDemo11 {
    public static void main(String[] args) {
        //寻找7的有缘数，是7的倍数，或者包含七
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个两位整数：");
        int a = sc.nextInt();
        int ge = a % 10;
        int shi = a / 10;
        boolean result = (a % 7 == 0 || ge == 7 || shi == 7);
        System.out.println(result);
    }
}
