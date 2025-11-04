package com.LT.Learning.variable;

public class variableDemo1 {
    public static void main(String[] args) {
        //微信余额：0；银行卡:20;支付宝：10
        //用一个变量记录微信余额
        double weixin = 0;
        //用一个变量记录银行卡余额
        double bank = 20;
        //用一个变量记录支付宝余额
        double zhifubao = 10;
        //输出现在一共多少钱
        System.out.println(weixin+bank+zhifubao);
        //微信收到10元
        weixin = weixin + 10;
        System.out.println(weixin);
        //微信发出2元红包
        weixin = weixin - 2;
        System.out.println(weixin);
        //现在余额共
        System.out.println(weixin+bank+zhifubao);
    }
}
