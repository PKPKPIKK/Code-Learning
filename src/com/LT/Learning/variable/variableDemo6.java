package com.LT.Learning.variable;
//确定Scanner的位置
import java.util.Scanner;

public class variableDemo6 {
    public static void main(String[] args) {
        //1.找到Scanner类
        Scanner sc = new Scanner(System.in);
        //2.接收键盘录入的整数
        int a = sc.nextInt();
        System.out.println(a);
        //3.接收键盘录入的double
        double b = sc.nextDouble();
        System.out.println(b);
        //4.接收键盘录入的字符串
        String c = sc.next();
        System.out.println(c);
    }

}
