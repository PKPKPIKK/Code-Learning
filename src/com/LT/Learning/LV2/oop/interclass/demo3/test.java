package com.LT.Learning.LV2.oop.interclass.demo3;

import java.lang.reflect.Method;

public class test {
    public static void main(String[] args) {
        new Swim() {
            @Override
            public void swimming() {
                System.out.println("重写了swim方法");
            }
        };

        method(
                new Animal() {
                    @Override
                    public void eat() {
                        System.out.println("小狗在吃骨头");
                    }
                }

        );
    }
    public static void method (Animal a){
        a.eat();
    }
}

