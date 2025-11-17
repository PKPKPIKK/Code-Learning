package com.LT.Learning.LV1.looploop;

public class looploopDemo8 {
    public static void main(String[] args) {
        //打印乘法表
        System.out.println("-----------------------------");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
