package com.LT.Learning.LV1.looploop;

public class looploopDemo6 {
    public static void main(String[] args) {
        //打印菱形
        for (int i = 1; i <= 4; i++) {
            for (int j = i;  j <= 3; j++) {
                System.out.print(" ");
            }
           for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 7 - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
