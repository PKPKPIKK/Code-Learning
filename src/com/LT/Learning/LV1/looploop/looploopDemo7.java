package com.LT.Learning.LV1.looploop;

public class looploopDemo7 {
    public static void main(String[] args) {
        //打印输出空心菱形
        //1.菱形上半部分
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int j = 2; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            if (i >= 2) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2.菱形下半部分
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            if(i == 1){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
