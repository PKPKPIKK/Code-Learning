package com.LT.Learning.LV1.practice;

public class practiceDemo8 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,7};
        int[] arr2 = {2,4,6,8};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
            arr3[i + arr1.length] = arr2[i];
        }
        for (int i = 0; i < arr3.length - 1; i++) {
            //第一次已经吧最大的放在最后了，下一次迭代就不需要看最后相邻的两个了
            for (int j = 0; j < arr3.length - i -1; j++) {
                int temp = arr3[j];
                if(arr3[j] > arr3[j + 1]){
                    arr3[j] = arr3[ j + 1];
                    arr3[ j + 1] = temp;
                }
            }
            }
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i] + " ");
        }
    }
}
