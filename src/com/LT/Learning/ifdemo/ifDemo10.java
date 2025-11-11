package com.LT.Learning.ifdemo;

import java.util.Scanner;

public class ifDemo10 {
    public static void main(String[] args) {
        // 计算阶梯电费，输入用电量
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用电量：");
        int a = sc.nextInt();
        double cost;
        if(a <= 100)
            cost = a * 0.5;
            else if(a <= 200)
                cost = 100 * 0.5 + (a - 100) * 0.8;
            else
                cost = 100 *0.5 + 100 * 0.8 + (a - 200) * 1.2;
            System.out.println("电费为" + cost);
    }
}
