package com.LT.Learning.LV2.oop.ooptest6;

public class test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        s.setHeight(183);
        s.setWeight(60);
        System.out.println(s.getName() + "," + s.getAge() + "," + s.getHeight() + "," + s.getWeight());
        //体重增加10KG，大二
        s.setAge(s.getAge() + 1);
        s.setWeight( s.getWeight() + 10 );
        System.out.println(s.getName() + "," + s.getAge() + "," + s.getHeight() + "," + s.getWeight());
        //体重少3，身高加2，大三
        s.setAge(s.getAge() + 1);
        s.setHeight( s.getHeight() + 2);
        s.setWeight( s.getWeight() -3);
        System.out.println(s.getName() + "," + s.getAge() + "," + s.getHeight() + "," + s.getWeight());
        //打印毕业后所有的信息，大四
        s.setAge(s.getAge() + 1);//刚上大四
        System.out.println(s.getName() + "," + s.getAge() + "," + s.getHeight() + "," + s.getWeight());
        s.setAge(s.getAge() + 1);//大四毕业后
        System.out.println(s.getName() + "," + s.getAge() + "," + s.getHeight() + "," + s.getWeight());
    }
}
