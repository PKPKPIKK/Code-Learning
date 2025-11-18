package com.LT.Learning.LV1.array;

import java.util.Scanner;

public class arrayDemo4 {
    //动态初始化，键盘录入，再输出
    public static void main(String[] args) {
      int[] arr  = new int [5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i+1) + "个数字：");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
