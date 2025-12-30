package com.LT.Learning.LV2.extendstest.Test7;

public class Student extends Person{
     private String grade;

    public Student() {
        super();
    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    public void study(){
        System.out.println("正在学习");
    }
}
