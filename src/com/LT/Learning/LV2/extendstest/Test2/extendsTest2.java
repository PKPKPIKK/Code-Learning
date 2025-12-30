package com.LT.Learning.LV2.extendstest.Test2;

public class extendsTest2 {
    public static void main(String[] args) {
        Andriod a = new Andriod();
        a.brand = "huawei";
        a.price = 19999;
        a.NFC();
        a.call();
        Ios apple = new Ios();
        apple.brand = "ios";
        apple.price = 8888;
        apple.call();
        Laptop pc = new Laptop();
        pc.brand = "lenovo";
        pc.price = 9999;
        pc.coding();
    }
}
