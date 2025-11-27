package com.LT.Learning.LV1.practice;

public class practiceDemo13 {
    public static void main(String[] args) {
        //接雨水
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int heighRight = arr[arr.length - 1];
        int heighLeft = arr[0];
        int[] leftMax = new int[arr.length];
        int[] rightMax = new int[arr.length];
        //从左往右，记录可以接雨水的最大值（包含柱子）
        for (int i = 0; i < arr.length; i++) {
            if(heighLeft > arr[i]){
                leftMax[i] = heighLeft;
            }else{
                leftMax[i] = arr[i];
                heighLeft = arr[i];
            }
        }
        for (int i = rightMax.length - 1; i >= 0; i--) {
            if(heighRight > arr[i]){
                rightMax[i] = heighRight;
            }else{
                rightMax[i] = arr[i];
                heighRight = arr[i];
            }
        }
       //取上面数组的交集
        int[] result = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(leftMax[i] <= rightMax[i]){
                result[i] = leftMax[i];
            }else{
                result[i] = rightMax[i];
            }
            sum += result[i];
            sum -= arr[i];
        }
        System.out.println(sum);
    }
}
