package com.LT.Learning.LV1.practice;

public class practiceDemo4 {
    public static void main(String[] args) {
        //老数组搬运到新数组
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
            System.out.print(arr2[i]);
        }
        System.out.println();
    }
}
