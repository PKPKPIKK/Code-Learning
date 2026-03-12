package com.LT.Learning.LV2.oop.interfacedemo1;

public interface Inter {
    public abstract void method();
    public default  void show(){
        System.out.println("接口中的默认方法---show");
    }
}
