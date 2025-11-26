package com.LT.Learning.LV1.practice;

public class practiceDemo9 {
    public static void main(String[] args) {
        //移除所规定元素，并输出数组中剩下的元素
            int[] arr = {1,1,2,2,2,3,3,3,3};
            int num = 2;
            int[] result = del(arr,num);
    }
    public static int[] del(int[] arr,int num){
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != num){
                arr[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("剩余元素为：" + j);
        return arr;
    }
}
