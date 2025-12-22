package com.LT.Learning.LV2.oop.ooptest5;

public class Dog {
    private String name;
    private int age;
        //get;set
    public void setName(String value){
        // 给对象中的属性进行赋值
        name = value;
    }
    public  String getName(){
        return name;
    }
    public void setAge(int num){
        if(num >= 0 && num <= 15){
            age = num;
        }else{
            System.out.println("输入年龄必须在0-15之内");
        }
    }
    public int getAge(){
        return age;
    }
    public void eat(){
        System.out.println(age + "岁的" + name + "，正在吃骨头！");
    }
    }

