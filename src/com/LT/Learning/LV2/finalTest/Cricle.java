package com.LT.Learning.LV2.finalTest;

public class Cricle {
    private double radii;//半径
    final private double PI = 3.14;
    //构造方法
    public Cricle(){

    }
    public Cricle(double radii){
        this.radii = radii;
    }

    public double getRadii() {
        return radii;
    }

    public double getPI() {
        return PI;
    }

    public void setRadii(double radii) {
        this.radii = radii;
    }
    public double getArea(){
        return PI * radii * radii;
    }
    public double getLength(){
        return PI * 2 * radii;
    }
}
