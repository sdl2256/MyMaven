package com.sun.swing.messagebox;

import javax.swing.JOptionPane;
import java.awt.*;

/**
 * Created by SDL on 2015/4/29.
 */
public class MessageBoxTest {

    public static void main(String[] args) {


        Toolkit.getDefaultToolkit().beep();

        JOptionPane.showMessageDialog(null, "ERROR_MESSAGE", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);


        Toolkit.getDefaultToolkit().beep();

        JOptionPane.showMessageDialog(null, "INFORMATION_MESSAGE", "INFORMATION_MESSAGE", JOptionPane.INFORMATION_MESSAGE);


        Toolkit.getDefaultToolkit().beep();

        JOptionPane.showMessageDialog(null, "WARNING_MESSAGE", "WARNING_MESSAGE", JOptionPane.WARNING_MESSAGE);


        Toolkit.getDefaultToolkit().beep();

        JOptionPane.showMessageDialog(null, "QUESTION_MESSAGE", "QUESTION_MESSAGE", JOptionPane.QUESTION_MESSAGE);


        Toolkit.getDefaultToolkit().beep();

        JOptionPane.showMessageDialog(null, "PLAIN_MESSAGE", "PLAIN_MESSAGE", JOptionPane.PLAIN_MESSAGE);
    }
}
