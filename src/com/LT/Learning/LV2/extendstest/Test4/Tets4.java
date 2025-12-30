package com.LT.Learning.LV2.extendstest.Test4;

public class Tets4 {
    public static void main(String[] args) {
        SmartDevice phone = new SmartDevice();
        phone.name = "手机";
        phone.price = 5000;
        System.out.println(phone.name + ":" + phone.payment());
        SmartDevice pad = new SmartDevice();
        pad.name = "平板";
        pad.price = 3000;
        System.out.println(pad.name + ":" + pad.payment());
        SmartDevice laptop = new SmartDevice();
        laptop.name = "笔记本";
        laptop.price = 10000;
        System.out.println(laptop.name + ":" + laptop.payment());
    }
}
