package com.LT.Learning.LV1.operator;

import java.util.Scanner;

public class operatorDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入秒数：");
        int time = sc.nextInt();
        int hour = time / 3600;
        int minute = time % 3600 / 60;
        int second = time % 60;
        System.out.printf("%d %d %d",hour,minute,second);
        //换行
        System.out.println();
        //输出为：小时 分 秒
        System.out.println(hour + "小时" + minute + "分钟" + second + "秒");
    }

}
