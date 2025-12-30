package com.LT.Learning.LV2.extendstest.Test7;

public class MajorTeacher extends Teacher{
    public MajorTeacher() {
    }

    public MajorTeacher(String name, int age, String project) {
        super(name, age, project);
    }

    @Override
    public void teach() {
        System.out.println("教授专业课知识");
    }
}
