package com.LT.Learning.LV1.method;

public class methodDemo3 {
    public static void main(String[] args) {
        //遍历打印数组，格式[1, 2, 3, 4, 5]
        int[] arr = {1,2,3,4,5};
        printarr(arr);
    }
    //没有返回值的方法，不需要把结果返回给上面的调用数
    public static void printarr (int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
