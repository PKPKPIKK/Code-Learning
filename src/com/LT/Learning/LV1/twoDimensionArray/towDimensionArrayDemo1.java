package com.LT.Learning.LV1.twoDimensionArray;

public class towDimensionArrayDemo1 {
    public static void main(String[] args) {
        //二维数组静态初始化
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        //以后建议二维数组这样定义，
        int[][] arr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        //获取其中的元素
        System.out.println(arr[0]);//[I@f6f4d33;二维数组中第一个一维数组的地址值
        //二维数组中第一个一维数组的第一个元素
        System.out.println(arr[2][1]);
        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr1[i].length; i1++) {
                System.out.print(arr1[i][i1] + " ");
            }
            System.out.println();
        }
    }
}
