package org.example.prac.var1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Q3SwingGpt {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("평균 확인 프로그램");
        f.setSize(500, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font ft1 = new Font("고딕", Font.BOLD, 20);

        JButton mathAvg = new JButton();
        mathAvg.setText("수학 평균점수 확인");
        mathAvg.setFont(ft1);
        mathAvg.setBackground(Color.CYAN);

        JButton engAvg = new JButton();
        engAvg.setText("영어 평균점수 확인");
        engAvg.setFont(ft1);
        engAvg.setBackground(Color.MAGENTA);

        FlowLayout flowLayout = new FlowLayout();
        f.setLayout(flowLayout);

        mathAvg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mathSum = 0;
                int x = 0;
                boolean validInput = false;
                while (!validInput) {
                    String mathInput = JOptionPane.showInputDialog("몇 명의 수학 점수를 입력하시겠습니까");
                    try {
                        x = Integer.parseInt(mathInput);
                        if (x < 1) {
                            JOptionPane.showMessageDialog(f, "확인하고 싶은 인원을 다시 입력해주세요.");
                        } else {
                            validInput = true;
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(f, "잘못된 입력입니다. 숫자를 입력하세요.");
                    }
                }
                for (int i = 0; i < x; i++) {
                    boolean validScore = false;
                    while (!validScore) {
                        String mathJumsu = JOptionPane.showInputDialog("수학 점수를 입력하시오.");
                        try {
                            int score = Integer.parseInt(mathJumsu);
                            mathSum += score;
                            validScore = true;
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(f, "잘못된 점수입니다. 숫자를 입력하세요.");
                        }
                    }
                }
                double mathAvg = (double) mathSum / x;
                JOptionPane.showMessageDialog(f, "수학 점수의 평균은 " + mathAvg);
            }
        });

        engAvg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int engSum = 0;
                int x = 0;
                boolean validInput = false;
                while (!validInput) {
                    String engInput = JOptionPane.showInputDialog("몇 명의 영어 점수를 입력하시겠습니까");
                    try {
                        x = Integer.parseInt(engInput);
                        if (x < 1) {
                            JOptionPane.showMessageDialog(f, "확인하고 싶은 인원을 다시 입력해주세요.");
                        } else {
                            validInput = true;
                        }
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(f, "잘못된 입력입니다. 숫자를 입력하세요.");
                    }
                }
                for (int i = 0; i < x; i++) {
                    boolean validScore = false;
                    while (!validScore) {
                        String engJumsu = JOptionPane.showInputDialog("영어 점수를 입력하시오.");
                        try {
                            int score = Integer.parseInt(engJumsu);
                            engSum += score;
                            validScore = true;
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(f, "잘못된 점수입니다. 숫자를 입력하세요.");
                        }
                    }
                }
                double engAvg = (double) engSum / x;
                JOptionPane.showMessageDialog(f, "영어 점수의 평균은 " + engAvg);
            }
        });

        f.add(mathAvg);
        f.add(engAvg);

        f.setVisible(true);
    }
}