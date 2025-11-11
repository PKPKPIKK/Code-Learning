package com.LT.Learning.LV1.variable;

public class varibaleDemo5 {
    public static void main(String[] args) {
    //1.定义变量，记录了体重和身高
        double weight = 76.0;
        double height = 1.72;
        //2.计算BMI指数
        double bmi = weight / (height * height);
        System.out.println("bmi指数为：" + String.format("%.2f", bmi));
    //3.计算当前身高下，体重在什么范围内，bmi在18.5-23.9
        double weight1 = height * height * 18.5;
        double weight2 = height * height * 23.9;
        System.out.println("体重应该在" + String.format("%.2f", weight1) + "和" + String.format("%.2f", weight2) + "之间");
    }
}
