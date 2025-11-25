package com.LT.Learning.LV1.practice;

import java.util.Random;
import java.util.Scanner;

public class practiceDemo6 {
    public static void main(String[] args) {
        //抽取奖金
        int[] money = {2,588,888,100,10000};
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < money.length; i++) {
            int num = r.nextInt(4);
            int temp = money[i];
            money[i] = money[num];
            money[num] = temp;
        }
        for (int i = 0; i < money.length; i++) {
            System.out.println(money[i] + "元的奖金被抽出");
        }
    }
}
