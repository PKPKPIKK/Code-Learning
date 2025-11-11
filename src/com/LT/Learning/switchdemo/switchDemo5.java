package com.LT.Learning.switchdemo;

import java.util.Scanner;

public class switchDemo5 {
    public static void main(String[] args) {
        // 利用switch进行 + - * /
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int b = sc.nextInt();
        String  operator = "+";
        int result = switch (operator){
          case "+" -> a + b;
          case "-" -> a - b;
          case "*" -> a * b;
          case "/" -> a / b;
          default -> 0;
        };
        System.out.println(result);
    }
}
