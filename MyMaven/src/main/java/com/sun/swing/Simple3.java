package com.sun.swing;

/**
 * Created by SDL on 2015/4/28.
 * Simple3.java - 处理事件的第三种方法
 * For this example, we will use inner member classes to
 * 在这个例子中，利用一般内部类来监听每个事件源产生的事件
 * 该方法避免了第二种方法中由于使用匿名内部类而导致的代码混乱
 * 便于集中处理事件代码
 * 每一个Hander可以被工具栏或菜单多次使用
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Simple3 {
    private static JFrame frame;   // 定义为静态变量以便main使用
    private static JPanel myPanel; // 该面板用来放置按钮组件
    private JButton button1;       // 这里定义按钮组件
    private JButton button2;       // 以便让ActionListener使用

    // 利用一般内部类来监听每一个事件源产生的事件如(button1, button2)
    private class Button1Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "按钮1 被点击");
        }
    }

    private class Button2Handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(frame, "按钮2 被点击");
        }
    }

    public Simple3()                //  // 构造器, 建立图形界面
    {
        // 新建面板
        myPanel = new JPanel();
        // 新建按钮
        button1 = new JButton("按钮1");  // 新建按钮1
        button2 = new JButton("按钮2");

        // 对每一个组件注册监听内部类
        button1.addActionListener(new Button1Handler());
        button2.addActionListener(new Button2Handler());

        myPanel.add(button1);        // 添加按钮到面板
        myPanel.add(button2);
    }

    public static void main(String s[]) {
        Simple3 gui = new Simple3();  // 新建Simple3组件

        frame = new JFrame("Simple3");  // 新建JFrame
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