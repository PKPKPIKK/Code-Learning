package com.LT.Learning.LV1.practice;

import java.util.Random;
import java.util.Scanner;

public class practiceDmoo7 {
    public static void main(String[] args) {
        int[] arr1 = createNumber();
        int[] arr2 = userInputNumber();
        System.out.print("中奖号码为：" );
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
        System.out.println();
        System.out.print("您的号码为：" );
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t" );
        }
        //判断获得几等奖
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                if(arr2[i] == arr1[j]){
                    redCount++;
                    //如果找到了，因为唯一性，就不需要继续判断后续的了
                    break;
                }
            }
        }
        if(arr1[arr1.length - 1] == arr2[arr2.length - 1]){
            blueCount++;
        }
        System.out.println();
       if(redCount == 6 && blueCount == 1){
           System.out.println("恭喜你，中奖1000万！！！");
       }else if(redCount == 6 && blueCount == 0){
           System.out.println("恭喜你，中奖500万！！！");
       }else if(redCount == 5 && blueCount == 1){
           System.out.println("恭喜你，中奖3000元！！！");
       }else if((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)){
           System.out.println("恭喜你，中奖200元！！！");
       }else if((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)){
           System.out.println("恭喜你，中奖10元！！！");
       }else if((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)){
           System.out.println("恭喜你，中奖5元！！！");
       }else{
           System.out.println("谢谢参与！！！");
       }
    }
    //生成双色球中奖数字
    public static int[] createNumber() {
        Random r = new Random();
        int[] arr = new int[7];
        arr[6] = r.nextInt(16) + 1;
        for (int i = 0; i < 6;) {
            int redNumber = r.nextInt(36) + 1;
            boolean flag = contains(arr,redNumber);
            if(!flag){
                arr[i] = redNumber;
                i++;
            }
        }
        return arr;
    }
    //判断数字在数组中是否重复
    public static boolean contains(int[] arr,int num){
        for (int i = 0; i < 6; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
    //用户输入双色球数字
    public static int[] userInputNumber(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for (int i = 0; i < 6; ) {
            System.out.println("请输入" + "第" + (i + 1) + "个红球号码:");
            int redNum = sc.nextInt();
            if(redNum >=1 && redNum <= 36) {
                boolean flag = contains(arr, redNum);
                if (!flag) {
                    arr[i] = redNum;
                    i++;
                }else{
                    System.out.println("输入数字存在重复，请重新输入。");
                }
            }else{
                System.out.println("输入数字不规范，请重新输入。");
            }
        }
        while(true){
            System.out.println("请输入第七个蓝球号码:");
            int blueNum = sc.nextInt();
            if(blueNum > 16 || blueNum < 1){
                System.out.println("输入的数字不符合规范，请重新输入。");
            }else{
                arr[6] = blueNum;
                break;
            }
        }
        return arr;
    }
}