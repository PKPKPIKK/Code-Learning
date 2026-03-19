package com.LT.Learning.Game.Test;

import java.util.Random;

public class test {
    public static void main(String[] args) {
        //打乱顺序，再4个一组添加到二位数组当中
        int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //打乱数组中数据的顺序
        //便利数组得到每一个元素，把这个元素和数组中随机数字交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();
    //二维数组
        int[][] data = new int[4][4];
//        int index = 0;
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 4; j++) {
//                data[i][j] = tempArr[index];;
//                index++;
//            }
//        }
        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
