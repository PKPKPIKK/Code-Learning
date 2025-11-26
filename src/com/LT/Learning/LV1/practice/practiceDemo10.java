package com.LT.Learning.LV1.practice;

import java.util.Random;

public class practiceDemo10 {
    public static void main(String[] args) {
        //M和N，M为红包总数，N为红包个数，现在有N个人抽红包，金额随机，打印金额
        //每个人最少一分钱；领完后要预留剩下的够分的钱；最后一个人领剩余的钱
        int money = 5;//分
        int N = 5;
        Random r = new Random();
        //用循环抽取红包
        for (int i = 1; i <= N -1; i++) {
             int myMoney = r.nextInt(money - (N - i)) + 1;
             money -=myMoney;
            System.out.println("第" + i + "个人抢到" + myMoney/100.0 + " 元");
        }
        System.out.println("第" + N + "个人抢到" + money/100.0 + "元");
    }
}
