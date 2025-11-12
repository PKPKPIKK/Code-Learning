package com.LT.Learning.LV1.loopwhile;

import java.util.Scanner;

public class whileDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        int sum = 0;
        if( n < 0) {
            n = -n;
        }
        while(n != 0){
            sum = sum + n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }
}
