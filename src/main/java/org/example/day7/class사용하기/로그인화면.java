package org.example.day7.class사용하기;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 로그인화면 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("나의 일기장");
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font ft = new Font("고딕", Font.BOLD, 90);
        Font ft2 = new Font("고딕", Font.BOLD, 25);

        JLabel top = new JLabel();
        top.setText("일기장");
        top.setFont(ft);
        JLabel idLa = new JLabel();
        idLa.setText("ID");
        idLa.setFont(ft2);
        JLabel pwLa = new JLabel();
        pwLa.setText("PW");
        pwLa.setFont(ft2);

        //입력하는 객체
        JTextField id = new JTextField(10);
        id.setFont(ft2);
        id.setBackground(Color.BLUE);
        id.setForeground(Color.RED);
        JPasswordField pw = new JPasswordField(10);
        pw.setFont(ft2);
        pw.setBackground(Color.CYAN);
        pw.setForeground(Color.YELLOW);

        JButton ok = new JButton();
        ok.setText("OK");
        ok.setFont(ft2);
        ok.setBackground(Color.GREEN);
        JButton del = new JButton();
        del.setText("DEL");
        del.setFont(ft2);
        del.setBackground(Color.GREEN);

        //넣어서해보기
//        JLabel err = new JLabel();
//        err.setText("아이디나 비밀번호를 잘못 입력했습니다. 다시 입력하세요");
//        err.setForeground(Color.RED);

        //이미지를 넣을 때는 이미지 아이콘으로 만들어서 버튼에 설정해야함.
        ImageIcon icon = new ImageIcon("ok.png");
        ImageIcon icon2 = new ImageIcon("del.png");
        ok.setIcon(icon);
        del.setIcon(icon2);

        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        frame.add(top);
        frame.add(idLa);
        frame.add(id);
        frame.add(pwLa);
        frame.add(pw);
        frame.add(ok);
        frame.add(del);

        // ok버튼 - id, pw가 root, 1234가 맞는지 체크
        // del버튼 - 입력한 값 지우기

        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ok 버튼을 눌렀을 때 처리하는 내용
                String id2 = id.getText();
                String pw2 = pw.getText();
                System.out.println(id2 + " " + pw2);

                System.out.println(id2.length());
                System.out.println(pw2.length());
                if (id2.length() > 0 && pw2.length() > 0) {
                    if (id2.equals("root") && pw2.equals("1234")) {
                        frame.setTitle("로그인 성공!!");
//                        JOptionPane.showMessageDialog(frame, "로그인 성공!!");
                    } else {
                        frame.setTitle("로그인 실패!!");
//                        err.add(frame, BorderLayout.PAGE_END);
                    }
                } else {
                    frame.setTitle("아이디나 패스워드를 다시 입력하시오.");
//                    JOptionPane.showMessageDialog(frame, "아이디나 패스워드를 다시 입력하시오.");
                }

            }
        });

        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                id.setText("");
                pw.setText("");
            }
        });


        frame.setVisible(true);
    }
}
