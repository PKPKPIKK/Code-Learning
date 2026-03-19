package com.LT.Learning.Game.Test;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.event.*;

public class Test2 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        //设置界面的宽高
        jFrame.setSize(488,430);
        //设置界面的标题
        jFrame.setTitle("事件演示");
        //设置界面置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(3);
        //位置初始化
        jFrame.setLayout(null);
        //创建一个按钮
        JButton jbt = new JButton("点击");
        //设置位置宽高
        jbt.setBounds(0,0,100,50);
        //add.ActionListener添加动作监听（鼠标左键点击，空格）
        //参数为事件被触发后执行的代码
        jbt.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("1");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("2");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("3");
            }
        });
        jFrame.getContentPane().add(jbt);
        //让界面显示出来，写在最后
        jFrame.setVisible(true);
    }
}
