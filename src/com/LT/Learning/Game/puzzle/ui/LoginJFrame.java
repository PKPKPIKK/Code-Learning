package com.LT.Learning.Game.puzzle.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //跟登录相关的代码

    public LoginJFrame(){
        //设置界面的宽高
        this.setSize(488,430);
        //设置界面的标题
        this.setTitle("拼图 注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);


        //让界面显示出来，写在最后
        this.setVisible(true);
    }
}
