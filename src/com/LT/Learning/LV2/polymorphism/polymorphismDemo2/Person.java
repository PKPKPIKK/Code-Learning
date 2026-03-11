package com.LT.Learning.LV2.polymorphism.polymorphismDemo2;

public class Person {
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    public void keepPet(Dog dog,String something){
//        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + dog.getColor() + "的" + dog.getAge() + "岁的狗");
//        dog.eat(something);
//    }
//    public void keepPet(Cat cat,String something){
//        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + cat.getColor() + "的" + cat.getAge() + "岁的猫");
//        cat.eat(something);
//    }
    //或者用多态+if语句
    public  void keepPer( Animal a,String something){
        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的猫");
    }
}
