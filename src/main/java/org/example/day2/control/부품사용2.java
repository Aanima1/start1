package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class 부품사용2 {
    public static void main(String[] args) {
        //JFrame 만들고
        //버튼을 하나 만들어
        //그위에 얹어보세요
        //설정 마음대로

        JFrame jf = new JFrame(); // 주소
        jf.setSize(500,500);
        jf.setTitle("부품사용연습");

        JButton bt = new JButton();
        bt.setText("버튼버튼버튼");
        bt.setBackground(Color.BLUE);
        jf.setBackground(Color.RED);

        jf.add(bt);

        FlowLayout ly = new FlowLayout();
        jf.setLayout(ly);




        jf.setVisible(true);
    }
}
