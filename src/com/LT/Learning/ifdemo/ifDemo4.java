package com.LT.Learning.ifdemo;

public class ifDemo4 {
    public static void main(String[] args) {
        // 需求：判断一个数是否是大于60
        int a = 55;

        if(a > 0 && a < 100){
            if (a >= 60) {
                System.out.println("大于60");
            }else{
                System.out.println("小于60");
            }
            }else{
            System.out.println("输入的数字不合法");
        }
    }
}
