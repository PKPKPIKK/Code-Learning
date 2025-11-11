package com.LT.Learning.LV1.loopfor;

import java.util.Scanner;

public class forDemo7 {
    public static void main(String[] args) {
        // 练习6
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1;i <= num; i++ ){
        if( i % 2 == 0){
            sum -= i;
        }else {
            sum += i;
        }
        }
        System.out.println( sum);
    }
}
