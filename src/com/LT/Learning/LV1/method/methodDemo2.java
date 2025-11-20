package com.LT.Learning.LV1.method;

import java.util.Random;

public class methodDemo2 {
    public static void main(String[] args) {
    //随机生成10个1-100的数字，并且不能重复
    //这样的while比较繁琐，可以使最外围的i++放在只有无重复的时候执行即可
    Random r = new Random();
    int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
        while(true) {
            int count = 0;
            int num = r.nextInt(100) + 1;
           boolean flag = contains(num,arr);
            if (!flag) {
                arr[i] = num;
//                    i++或者把while换到这里
                break;
            }
        }
    }
        for (int k = 0; k < arr.length; k++) {
        System.out.print(arr[k] + "\t");
    }
}
//定义一个方法，取判断变量num在数组arr中是否存在
    public static boolean contains(int num,int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                //遇到一个相同的，就判断有，直接结束方法
                return true;
            }
        }
        return false;
    }
}
