package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;

public class 그래픽2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("그래픽 예제");

        Font ft = new Font("고딕", Font.PLAIN, 14);

        JButton bt = new JButton();
        bt.setText("나를 눌러!!");
        bt.setFont(ft);
        bt.setBackground(Color.lightGray);

        f.add(bt);


        f.setVisible(true);
    }
}
