package com.LT.Learning.LV2.toolclasstest;

public class ArryUitl {
    private ArryUitl(){};
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length -1){
                System.out.print(arr[i] + "]");
            }else{
                System.out.print(arr[i] + ",");
            }
        }
        System.out.println();
    }
    public static double getAverage(int[] arr){
    int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum * 1.0/arr.length;
    }

}
