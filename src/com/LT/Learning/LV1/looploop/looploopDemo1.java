package com.LT.Learning.LV1.looploop;

public class looploopDemo1 {
    public static void main(String[] args) {
        //System.out.println为先打印再换行
        //System.out.print为只打印不换行
        for (int i = 1; i <= 4; i++) {
            for (int i1 = 1; i1 <= 5; i1++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
