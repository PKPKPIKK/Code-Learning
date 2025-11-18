package com.LT.Learning.LV1.array;

public class arrayDemo13 {
    public static void main(String[] args) {
        //数组的合并,并按大小排序
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length - i - 1; j++) {
                if(arr3[j] > arr3[j + 1]){
                    int temp = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

    }
}
