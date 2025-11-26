package com.LT.Learning.LV1.practice;

public class practiceDemo11 {
    public static void main(String[] args) {
        //给两个正序数组，先合并，排序后找到中位数
        //不用冒泡排序算法，在放入的时候直接排序放入
        int[] arr1 = {1, 3, 5, 7,};
        int[] arr2 = {2, 4, 6, 8};
        double result = findMedianSortedArray(arr1,arr2);
        System.out.println(result);
    }

    public static double findMedianSortedArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        double result = 0;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(index1 == arr1.length){
                arr[i] = arr2[index2];
                index2++;
                continue;
            }
            if(index2 == arr2.length){
                arr[i] = arr1[index1];
                index1++;
                continue;
            }
            if(arr1[index1] <= arr2[index2]){
                arr[i] = arr1[index1];
                index1++;
            }else{
                arr[i] = arr2[index2];
                index2++;
            }
        }
        if(arr.length %2 == 0){
            result = (arr[arr.length/2] + arr[arr.length/2 -1])/2.0;
        }else{
            result = arr[(arr.length - 1)/2];

        }        return result;
    }
}
