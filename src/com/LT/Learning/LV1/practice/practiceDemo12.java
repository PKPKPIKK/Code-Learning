package com.LT.Learning.LV1.practice;

import java.util.Random;

public class practiceDemo12 {
    public static void main(String[] args) {
        //投票，计算得票率，找出票最多的候选者，0为齐全，其余为五位候选人
        int[] arr = new int[6];
        Random r = new Random();
        for (int i = 0; i < 1000; i++) {
            int num = r.nextInt(6);
          arr[num]++;
            }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "号候选人得票率：" + arr[i]*1.0/1000*100 + "%");
        }
        }

    }

