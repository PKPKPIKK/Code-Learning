package com.LT.Learning.LV2.codeblock;

import javax.swing.*;
import java.sql.SQLOutput;

public class Student {
    private String name;
    private int age;

//    {
//        System.out.println("Student类被创建了");
//    }
    static {
    System.out.println("静态代码块执行了！！！");
}
    public Student(){
    }
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}
