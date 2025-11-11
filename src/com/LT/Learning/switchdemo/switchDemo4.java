package com.LT.Learning.switchdemo;

import java.util.Scanner;

public class switchDemo4 {
    public static void main(String[] args) {
        //若语句体只有一行，那大括号和yield可以省略
        // 输入一个数字，判断星期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int week = sc.nextInt();
        String name = switch (week) {
            case 1 ->{
                yield "星期一";
            }
            case 2 ->{
                yield "星期二";
            }
            case 3 ->{
                yield "星期三";
            }
            case 4 ->{
                yield "星期四";
            }
            case 5 ->{
                yield "星期五";
            }
            case 6 ->{
                yield "星期六";
            }
            case 7 ->{
                yield "星期日";
            }
            default ->{
                yield "输入错误";
            }
        };
        System.out.println(name);
    }
}
