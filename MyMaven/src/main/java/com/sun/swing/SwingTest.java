package com.sun.swing;

import javax.swing.*;
public class SwingTest
{
  public static void main(String[] args)
  {
    JFrame jf=new JFrame("mybole");
    jf.setSize(600,400);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton btn=new JButton("winsun");
    jf.getContentPane().add(btn,"West");
    jf.show();
  }
}