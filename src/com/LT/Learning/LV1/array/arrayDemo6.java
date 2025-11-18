package com.LT.Learning.LV1.array;

import java.util.Scanner;

public class arrayDemo6 {
    public static void main(String[] args) {
        int[] arr = {33,5,22,44,55,33};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字：");
        int num = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                flag = true;
                System.out.println("数字" + num + "在数组中第" + (i+1) + "个位置");
                break;
            }
        }
        if (!flag){
            System.out.println("没有这个数字");
        }
    }
}
