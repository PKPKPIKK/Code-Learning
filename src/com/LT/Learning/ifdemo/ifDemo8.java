package com.LT.Learning.ifdemo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ifDemo8 {
    public static void main(String[] args) {
        // 冲卡赠送：
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入充值金额：");
        double a = sc.nextDouble();
        double  balance;
      if (a < 1000)
          balance = a ;
      else if( a < 2000 )
          balance = a  + 200;
      else if( a < 3000 )
          balance = a + 500;
      else
          balance = a + 1300;
        System.out.println("余额为：" + balance);
    }

}
