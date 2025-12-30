package com.LT.Learning.LV2.extendstest.Test7;

public class GeneralTeach extends Teacher{
    public GeneralTeach() {
    }

    public GeneralTeach(String name, int age, String project) {
        super(name, age, project);
    }

    @Override
    public void teach() {
        System.out.println("教授通识课知识");
    }
}
