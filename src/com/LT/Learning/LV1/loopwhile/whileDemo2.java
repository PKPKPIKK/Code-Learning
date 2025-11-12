package com.LT.Learning.LV1.loopwhile;

public class whileDemo2 {
    public static void main(String[] args) {
        double balance = 100000;
        double expectMoney = 200000;
        boolean flag = true;
        int year = 0;
        while(balance < expectMoney){
            balance = balance * 1.017;
            year++;
        }
        System.out.println("第" + year + "年，余额为：" + balance);
        }
    }

