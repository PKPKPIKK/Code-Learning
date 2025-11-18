package com.LT.Learning.LV1.array;

import java.util.Random;

public class arrayDemo9 {
    public static void main(String[] args) {
        //随机生成10个1-100的数字，并且不能重复
        //这样的while比较繁琐，可以使最外围的i++放在只有无重复的时候执行即可
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            while(true) {
                int count = 0;
                int num = r.nextInt(100) + 1;
                for (int j = 0; j < arr.length; j++) {
                    if (num == arr[j]) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    arr[i] = num;
//                    i++或者把while换到这里
                    break;
                }
                }
            }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + "\t");
        }
    }
}
