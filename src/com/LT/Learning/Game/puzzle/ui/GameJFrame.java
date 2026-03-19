package com.LT.Learning.Game.puzzle.ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    //JFrame:界面窗体
    //子类：界面窗体
    //规定：跟游戏相关的代码
    //创建二维数据，管理数据（打乱图片）
    int[][] data = new int[4][4];

    public GameJFrame(){
        //初始化界面
        initJFrame();
        //初始化菜单
        initJmenubar();
        //初始化数据（打乱）
        initData();
        //初始化图片
        initImage();
        //让界面显示出来
        this.setVisible(true);
    }

    private void initData() {
        int[] tempArr = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //打乱数组中数据的顺序
        //便利数组得到每一个元素，把这个元素和数组中随机数字交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        for (int i = 0; i < tempArr.length; i++) {
            System.out.print(tempArr[i] + " ");
        }
        System.out.println();
        //二维数组
        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }
    }


    private void initImage() {
        //内循环：一行添加四张图片
        //外循环：重复内循环四次
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 4 ; j++) {
                //创建一个JLable对象(管理对象)
                int number = data[i][j];
                JLabel jLabel = new JLabel(new ImageIcon("C:\\Users\\admin\\IdeaProjects\\Code-Learning\\src\\com\\LT\\Learning\\Game\\image\\animal\\animal1\\"+ number+ ".jpg"));
                //指定位置
                jLabel.setBounds(105 * j,105 * i,105,105);
                //把管理容器添加到界面当中
                this.getContentPane().add(jLabel);
                //表示下次一添加下一张图片
            }
        }
        }

    private void initJmenubar() {
        //初始化菜单
        //创建菜单对象
        JMenuBar jMenubar = new JMenuBar();
        //创建菜单上的选项
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");
        //创建选项下的条目
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reloginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");
        //将每个选项条目添加到选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reloginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);
        //将两个选项添加到菜单当中
        jMenubar.add(functionJMenu);
        jMenubar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenubar);
    }

    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603,680);
        //设置界面的标题
        this.setTitle("拼图单机版v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //取消内部默认的剧中放置
        this.setLayout(null);
    }
}
