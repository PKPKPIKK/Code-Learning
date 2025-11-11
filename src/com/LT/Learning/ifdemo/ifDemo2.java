package com.LT.Learning.ifdemo;

import java.util.Scanner;

public class ifDemo2 {
    public static void main(String[] args) {
        //初始最大生命值为200，初始生命值为200，最小生命值为1，受到攻击和回复的数值，判断是否越界，并输出当前生命值
        Scanner sc = new Scanner(System.in);
        double hp_max = 200;
        double hp_now = 200;
        double hp_min = 1;
        System.out.println("请输入伤害数值：");
        double gongji = sc.nextDouble();
        System.out.println("请输入回复数值：");
        double huifu = sc.nextDouble();
        hp_now = hp_now - gongji;
        if (hp_now <= hp_min) {
            hp_now = hp_min;
        }
        System.out.println("受到攻击后生命值为：" + hp_now);
        hp_now = hp_now + huifu;
        if (hp_now >= hp_max) {
            hp_now = hp_max;
        }
        System.out.println("恢复后生命值为：" + hp_now);
        }

    }
