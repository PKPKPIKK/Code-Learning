package com.LT.Learning.LV1.array;

import java.util.Random;

public class arrayDemo8 {
    public static void main(String[] args) {
        //随机打乱数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int temp;
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int index = r.nextInt(arr.length);
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
