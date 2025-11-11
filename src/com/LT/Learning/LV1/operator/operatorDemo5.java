package com.LT.Learning.LV1.operator;

public class operatorDemo5 {
    public static void main(String[] args) {
        short s1 = 100;
        short s2 = 200;
        byte b = (byte) (s1 + s2);
        //300变为2进制：100101100，后八位为00101100
        System.out.println(b);
        // 改变了原有数据的类型
        System.out.println(s1 + s2);
    }
}
