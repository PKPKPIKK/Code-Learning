package com.LT.Learning.LV1.method;

public class methodDemo5 {
    public static void main(String[] args) {
        double len1 = 1;
        double width1 = 2;
        double len2 = 3;
        double width2 = 4;
        if(getArea(len1,width1) > getArea(len2,width2)) {
            System.out.println("长方形1的面积大");
        }else if (getArea(len1,width1) < getArea(len2,width2)){
            System.out.println("长方形2的面积大");
        }else{
            System.out.println("长方形1和2的面积一样大");
        }

    }
    public static double getArea(double a, double b){
        return a * b;
    }
}
