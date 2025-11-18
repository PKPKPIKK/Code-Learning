package com.LT.Learning.LV1.array;

public class arrayDemo12 {
    public static void main(String[] args) {
        //数组中两个数字之和为指定数字,输出索引
        int[] arr = {2, 3, 4, 5};
        int target = 8;
        int count = 0;
        for (int i = 0; i < arr.length && count == 0; i++) {
            for (int j = 0; j < arr.length && count == 0; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i + ", " + j);
                    count++;
                }
            }
        }
    }
}