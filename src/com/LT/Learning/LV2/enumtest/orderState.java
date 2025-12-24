package com.LT.Learning.LV2.enumtest;

public enum orderState {
    //这个类所有的对象全部罗列出来
    PAYMENT_PENDING("待支付"),
    PROSESSING("处理中"),
    SHIPPING("配送中"),
    COMPLETED("已完成"),
    CANCELED("已取消");
    private String name;

    private orderState(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
