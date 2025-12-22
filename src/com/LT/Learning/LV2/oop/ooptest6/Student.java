package com.LT.Learning.LV2.oop.ooptest6;

public class Student {
    private String name;
    private int age;
    private  double weight;
    private  double height;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return  name;
    }
    public void setAge(int age){
        if(age >= 0 && age <= 100){
            this.age = age;
        }else{
            System.out.println("输入的年龄有误");
        }
    }
    public int getAge(){
        return age;
    }
    public void setWeight(double num2){
        if(num2 >=45 && num2 <= 100 ){
            weight = num2;
        }else{
            System.out.println("输入的体重有误");
        }
    }
    public double getWeight(){
        return weight;
    }
    public void setHeight(double num3){
        if(num3 >=140 && num3 <= 250 ){
            height = num3;
        }else{
            System.out.println("输入的身高有误");
        }
    }
    public double getHeight(){
        return height;
    }
    public void study(){
        System.out.println(name + "正在学习！");
    }

}
