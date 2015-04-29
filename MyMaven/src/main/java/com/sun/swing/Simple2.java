package com.sun.swing;

/**
 * Created by SDL on 2015/4/28.
 * Simple2.java - 处理事件的第二种方法
 * 在这个例子中，利用匿名内部类来监听每一个事件源产生的事件
 * 避免使用一些if语句来决定是哪个事件源.
 * 当工具栏、菜单栏目等需要处理同样的用户行为时，该方法将使代码更难维护。
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Simple2 {
    private static JFrame frame;   // 定义为静态变量以便main使用
    private static JPanel myPanel; // 该面板用来放置按钮组件
    private JButton button1;       // 这里定义按钮组件
    private JButton button2;       // 以便让ActionListener使用

    public Simple2()               // 构造器, 建立图形界面
    {
        // 新建面板
        myPanel = new JPanel();
        // 新建按钮
        button1 = new JButton("按钮1");  // 新建按钮1
        button2 = new JButton("按钮2");

        // 每一个事件源需要一个监听器
        // 定义一个匿名内部类来监听事件源产生的事件
        button1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(frame, "按钮1 被点击");
                    }
                }
        );

        button2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(frame, "按钮2 被点击");
                    }
                }
        );

        myPanel.add(button1);        // 添加按钮到面板
        myPanel.add(button2);
    }

    public static void main(String s[]) {
        Simple2 gui = new Simple2(); // 新建Simple2组件

        frame = new JFrame("Simple2");  // 新建JFrame
        // 处理关闭事件的通常方法
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.getContentPane().add(myPanel);
        frame.pack();
        frame.setVisible(true);
    }
}