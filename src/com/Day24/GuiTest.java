package com.Day24;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

public class GuiTest {
    public static void main(String[] args) {
        Frame frame = new Frame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("确定");

        frame.add(jPanel);
        jPanel.add(jButton);

        frame.setSize(400,400);
        frame.setLocation(200,200);
        frame.setVisible(true);

        frame.addWindowListener(new MyAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
        jButton.addMouseListener(new MyAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(1);
            }
        });
    }
}
