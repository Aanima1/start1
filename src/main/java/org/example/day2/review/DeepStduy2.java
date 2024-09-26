package org.example.day2.review;

import javax.swing.*;
import java.awt.*;

public class DeepStduy2 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        Font font = new Font("고딕", Font.BOLD, 15);
        FlowLayout flow = new FlowLayout();

        f.setSize(200, 400);
        f.setLayout(flow);






        JLabel l1 = new JLabel("총 게임 수 : ");
        l1.setFont(font);
        l1.setLayout(flow);

        JLabel l2 = new JLabel("첫 번째 사람이 이긴 수 : ");
        l2.setFont(font);
        l2.setLayout(flow);

        JLabel l3 = new JLabel("두 번째 사람이 이긴 수 : ");
        l3.setFont(font);
        l2.setLayout(flow);


        f.add(l1);
        f.add(l2);
        f.add(l3);

        f.setVisible(true);
    }
}
