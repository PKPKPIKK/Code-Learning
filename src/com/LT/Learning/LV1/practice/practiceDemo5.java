package com.LT.Learning.LV1.practice;
import java.util.Scanner;
public class practiceDemo5 {
    public static void main(String[] args) {
        //数字加密和解密
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于0的整数");
        int num;
        int count = 0;
        while(true) {
             num = sc.nextInt();
             if(num <= 0){
                 System.out.println("输入有误，请重新输入：");
             }else{
                 break;
             }
        }
        int temp = num;
        while(temp !=0){
                temp = temp /10;
                count++;
        }
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[arr.length - i - 1] = num % 10;
            num = num / 10;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10 ;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[arr.length - i - 1]+ " ");
        }
//        for (int i = 0,j = arr.length - 1;i < j; i++,j--) {
//            int nums = arr[i];
//            arr[i] = arr[j];
//            arr[j] = nums;
//        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 5){
                arr[i] += 5;
            }else{
                arr[i] -= 5;
            }
            System.out.print(arr[i] + " ");
        }
    }
}
