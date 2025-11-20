package com.LT.Learning.LV1.method;

public class methodDemo4 {
    public static void main(String[] args) {
        printMulTable();
    }
    public static void printMulTable(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
            System.out.println();

        }
    }
}
