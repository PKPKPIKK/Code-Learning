package com.LT.Learning.LV1.method;

import java.util.Scanner;

public class methodDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] scores = new double[10];
        for(int i = 0;i < scores.length;){
            System.out.println("请输入第" + (i+1) + "个成绩：");
            scores[i] = sc.nextDouble();
            if(scores[i] >= 0 && scores[i] <= 100){
                i++;
            }else{
                System.out.println("成绩无效，请重新输入");
            }
    }
        double jigelv = jigelv(scores);
        double sum = getSum(scores);
        double average = sum/scores.length;
        double max = getMax(scores);
        System.out.println("及格率：" + jigelv * 100 + "%");
        System.out.println("平均分为：" + average);
        System.out.println("最高分为：" + max);

    }
    public  static double jigelv(double[] arr){
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 60){
                count++;
            }
        }
        return count/arr.length;
    }
    public static double  getSum(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static  double getMax(double[] arr){
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
