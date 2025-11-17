package com.LT.Learning.LV1.looploop;

public class looploopDemp3 {
    public static void main(String[] args){
        //打印平行四边形
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 2; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 6; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
