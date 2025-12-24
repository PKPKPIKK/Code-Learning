package com.LT.Learning.LV2.staticTest;

public class test1 {
    public static void main(String[] args) {
        Student.teacherName = "阿伟";
        Student stu1 = new Student();
        stu1.name = "秦东";
        stu1.age = 18;
        Student stu2 = new Student();
        stu2.name = "秦东东";
        stu2.age = 18;
        stu2.teacherName = "小新";
        System.out.println(stu1.teacherName);
        System.out.println(stu2.teacherName);


    }
}
