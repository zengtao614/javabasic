package com.Day24;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

public class GuiTest2 {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        JPanel jp = new JPanel();
        JButton jb = new JButton("按钮");
        jf.setSize(400, 400);
        jf.setLocation(400, 400);
        jf.setVisible(true);

        jp.add(jb);
        jf.add(jp);
        jb.addMouseListener(new MyLisAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(1);
            }
        });
        jf.addWindowListener(new MyLisAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });

    }
}
