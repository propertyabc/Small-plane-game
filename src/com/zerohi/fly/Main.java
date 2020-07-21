package com.zerohi.fly;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        JFrame frame = new JFrame("Fly");
        ShootGame game = new ShootGame(); // ������
        frame.add(game); // �������ӵ�JFrame��
        frame.setSize(ShootGame.WIDTH, ShootGame.HEIGHT); // ���ô�С
        frame.setAlwaysOnTop(true); // ��������������
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ĭ�Ϲرղ���
        frame.setIconImage(new ImageIcon("images/icon.jpg").getImage()); // ���ô����ͼ��
        frame.setLocationRelativeTo(null); // ���ô����ʼλ��
        frame.setVisible(true); // �������paint

        game.action(); // ����ִ��

    }
}
