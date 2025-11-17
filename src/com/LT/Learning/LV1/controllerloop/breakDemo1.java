package com.LT.Learning.LV1.controllerloop;

public class breakDemo1 {
    public static void main(String[] args) {
        //循环的快速生成方式，次数.fori+回车
        for (int i = 1; i <= 100; i++) {
            if(i == 15)
                break;//看到循环直接结束，下面的语句不会执行
            System.out.println(i);
        }
    }
}
