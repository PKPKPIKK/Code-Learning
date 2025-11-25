package com.LT.Learning.LV1.twoDimensionArray;

public class towDimensionArrayDemo2 {
    public static void main(String[] args) {
        //二维数组静态初始化
        int[][] arr = new int[2][2];
            arr[0][0] = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " \t");
            }
            System.out.println();
        }
        }
    }

