package com.LT.Learning.LV1.loopfor;

import java.util.Scanner;

public class forDemo5 {
    public static void main(String[] args) {
        // 练习4
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个个数字：");
        int num2 = sc.nextInt();
        int result = 0;
        //if else
//        if (num1  < num2){
//            for(int i = num1;i <= num2; i++){
//                if( i % 3 ==0 && i % 5 == 0) {
//                    result ++;
//                }
//            }
//        }else{
//            for(int i = num2;i <= num1; i++){
//                if( i % 3 ==0 && i % 5 == 0) {
//                    result ++;
//                }
//            }
//        }
        //三元运算符
        int min = num1 < num2 ? num1 : num2;
        int max = num1 > num2 ? num1 : num2;
        for(int i = min;i <= max; i++){
            if( i % 3 ==0 && i % 5 == 0) {
                result ++;
            }
        }
        System.out.println( "同时满足的个数为： " + result);
    }
}
