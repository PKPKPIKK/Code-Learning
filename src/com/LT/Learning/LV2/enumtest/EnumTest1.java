package com.LT.Learning.LV2.enumtest;

public class EnumTest1 {
    public static void main(String[] args) {
    //获取枚举类的对象
        orderState o1 = orderState.PAYMENT_PENDING;
        //匹配
        switch(o1){
            case PAYMENT_PENDING:
                System.out.println("待支付");
                break;
            case PROSESSING:
                System.out.println("处理中");
                break;
            case SHIPPING:
                System.out.println("配送中");
                break;
            case COMPLETED:
                System.out.println("已完成");
                break;
            case CANCELED:
                System.out.println("已取消");
                break;
            default:
        }
    }
}
