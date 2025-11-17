package com.LT.Learning.LV1.looploop;

public class looploopDemo4 {
    public static void main(String[] args) {
        //图形分解打印平行四边形
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= 3; j++) {
                System.out.print("*");
            }
            for (int j = i; j <= 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
