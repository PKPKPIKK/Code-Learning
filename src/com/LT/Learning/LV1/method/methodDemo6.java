package com.LT.Learning.LV1.method;

import java.util.Scanner;

public class methodDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] scores = new int[5];
        for(int i = 0; i < scores.length; ){
            System.out.println("请输入第" + (i+1) + "个成绩：");
            scores[i] = sc.nextInt();
            if(scores[i] >= 0 && scores[i] <= 100){
                i++;
            }else{
                System.out.println("输入的分数有误，请重新输入：");
            }
        }
        int[] result = getMaxMin(scores);
        int max = result[0];
        int min = result[1];
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
        int sum = getSum(scores);
        System.out.println("总分为：" + sum);
        System.out.println("平均值为：" + (sum - max - min)/3);
    }
public static int[] getMaxMin(int[] arr){
        int[] result = {arr[0],arr[0]};
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] > result[1]){
            result[0] = arr[i];
        }else{
            result[1] = arr[i];
        }
    }
    return  result;
}
public static int getSum(int[] arr){
        int sum = 0;
    for (int i = 0; i < arr.length; i++) {
     sum += arr[i];
    }
    return sum;
}
}
