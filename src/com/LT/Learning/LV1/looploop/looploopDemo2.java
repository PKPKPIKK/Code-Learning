package com.LT.Learning.LV1.looploop;

public class looploopDemo2 {
    public static void main(String[] args) {
        //打印正三角形和倒三角形
        for (int i = 5; i >= 1; i--) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
