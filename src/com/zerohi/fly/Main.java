package com.zerohi.fly;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        JFrame frame = new JFrame("Fly");
        ShootGame game = new ShootGame(); // 面板对象
        frame.add(game); // 将面板添加到JFrame中
        frame.setSize(ShootGame.WIDTH, ShootGame.HEIGHT); // 设置大小
        frame.setAlwaysOnTop(true); // 设置其总在最上
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 默认关闭操作
        frame.setIconImage(new ImageIcon("images/icon.jpg").getImage()); // 设置窗体的图标
        frame.setLocationRelativeTo(null); // 设置窗体初始位置
        frame.setVisible(true); // 尽快调用paint

        game.action(); // 启动执行

    }
}
