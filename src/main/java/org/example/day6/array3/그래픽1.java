package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;

public class 그래픽1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(300, 300);
        f.setTitle("그래픽 연습");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // x를 누르면 프로그램 종료 설정!

        JButton bt = new JButton();
        bt.setText("나를 눌러"); // 함수, 메서드, 명령어는 명령어(입력 데이터);

        JButton bt2 = new JButton();
        bt2.setText("@@@@@@@@");

        f.add(bt, BorderLayout.NORTH);
        f.add(bt2, BorderLayout.CENTER);


        f.setVisible(true);
    }
}
