package com.LT.Learning.LV1.controllerloop;

import java.util.Random;
import java.util.Scanner;

public class breakDemo4 {
    public static void main(String[] args) {
        Random r = new Random();
        //生成随机数
        //int num = r.nextInt(); 默认在int的取值范围内获取随机数
        //在小括号里写最大n，获取0-(n-1)的随机数
        //小括号里写两个数字，a-b,包含a不包含b
        int num = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int flag = 0;
        while (true) {
            System.out.println("请输入一个数字：");
            n = sc.nextInt();
            flag++;
            if(flag == 10){
                num = n;
            }
            if (n == num) {
                System.out.println("恭喜你猜对了");
                break;
            }
            //每三次没猜中才会触发小提示，每十次没猜中才会触发大提示
            if(flag % 3 == 0){
                System.out.println("数字范围为"+ (num - 5) + "~" + (num + 5));
            }

        }
    }
}

