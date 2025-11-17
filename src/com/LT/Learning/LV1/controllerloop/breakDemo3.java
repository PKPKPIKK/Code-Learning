package com.LT.Learning.LV1.controllerloop;

import java.util.Scanner;

public class breakDemo3 {
    public static void main(String[] args) {
        //输入一个正整数，判断是否是质数
        //质数找到平方根就可以找到是否为质数
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int count = 0;
        while(true){
            System.out.println("请输入一个整数：");
            n = sc.nextInt();
            if(n < 2){
                System.out.println("输入的整数必须大于2");
            }else{
                break;
            }
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                count++;
                break;//只要有一个找到，则不是质数
            }
        }
        if(count == 0){
            System.out.println("输入的整数是质数");
        }else{
            System.out.println("输入的整数不是质数");
        }

    }
}
