package com.LT.Learning.LV1.ifdemo;

public class ifDemo3 {
    public static void main(String[] args) {
        /*
            if语句的细节
            1.if语句大括号的位置
                左括号写在上一行的末尾，不要单独一行
            2. if语句大括号的省略
                如果大括号中只有一行代码，那么大括号可以省略
            3.小括号后不能有分号
            4.判断布尔类型的变量
                判断布尔类型的变量，直接把变量写在小括号里即可
        */
        //1.定义一个变量表示人的体温
        double temp = 37.5;
        //2.对体温进行判断
        if (temp >= 37.5)
            System.out.println("请自我隔离");
        boolean b = true;
        if (b)
            System.out.println("请继续工作");
    }
}
