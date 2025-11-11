package com.LT.Learning.ifdemo;

import java.util.Scanner;

public class ifDemo9 {
    public static void main(String[] args) {
    //输入身高，体重，计算bmi，并输出区间
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身高：");
        double height = sc.nextDouble();
        System.out.println("请输入体重：");
        double weight = sc.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("过轻");
        } else if (bmi < 25) {
            System.out.println("正常");
        } else if (bmi < 28) {
            System.out.println("过重");
        } else{
            System.out.println("肥胖");
        }
    }
}
