package com.LT.Learning.LV1.controllerloop;

import java.util.Scanner;

public class breakDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int m = 0;
        while (true) {
            System.out.println("请输入第一个整数：");
            n = sc.nextInt();
            System.out.println("请输入第二个整数：");
            m = sc.nextInt();
            if (n > 0 && m > 0)
            {
                break;
            } else {
                System.out.println("输入数据有误，均需>0");
            }

        }
    }
}


