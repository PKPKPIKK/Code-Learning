package com.LT.Learning.LV1.controllerloop;

import java.util.Scanner;

public class continueDemo3 {
    public static void main(String[] args) {
        //牛牛数数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            if(i % 10 == 4 || i / 10 %10 == 4 || i % 4 ==0){
                continue;
            }
            System.out.println(i);
        }


    }
}
