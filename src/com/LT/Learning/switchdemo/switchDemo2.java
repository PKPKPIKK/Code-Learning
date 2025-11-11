package com.LT.Learning.switchdemo;

public class switchDemo2 {
    public static void main(String[] args) {
        int num = 1;
        switch(num){
            case 1:
                System.out.println("数字一");
                break;
            case 2:
                System.out.println("数字二");
                break;
            case 3:
                System.out.println("数字三");
                break;
            default:
                System.out.println("数字错误");
                break;
        }
    }
}
