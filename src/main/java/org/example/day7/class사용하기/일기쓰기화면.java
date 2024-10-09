package org.example.day7.class사용하기;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class 일기쓰기화면 {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("일기쓰는 화면");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(350, 700);

        Font ft1 = new Font("고딕", Font.BOLD, 20);
        Font ft2 = new Font("고딕", Font.BOLD, 40);


        JLabel weatherLa = new JLabel();
        weatherLa.setText("오늘의 날짜");
        weatherLa.setFont(ft1);
        JLabel titleLa = new JLabel();
        titleLa.setText("오늘의 제목");
        titleLa.setFont(ft1);
        JLabel writeLa = new JLabel();
        writeLa.setText("오늘의 내용");
        writeLa.setFont(ft1);

        JTextField weather = new JTextField(10);
        weather.setFont(ft1);
        weather.setBackground(Color.GREEN);
        JTextField title = new JTextField(10);
        title.setFont(ft1);
        title.setBackground(Color.GREEN);
        JTextField write = new JTextField(10);
        write.setFont(ft1);
        write.setBackground(Color.GREEN);


        JButton save = new JButton();
        save.setText("파일에 일기 저장");
        save.setFont(ft2);
        save.setBackground(Color.RED);

        FlowLayout flowlayout = new FlowLayout();
        f.setLayout(flowlayout);

        f.add(weatherLa);
        f.add(weather);
        f.add(titleLa);
        f.add(title);
        f.add(writeLa);
        f.add(write);
        f.add(save);

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String weather2 = weather.getText();
                String title2 = title.getText();
                String write2 = write.getText();

                if (weather2.length() > 0 && title2.length() > 0 && write2.length() > 0) {
                    JOptionPane.showMessageDialog(f, weather2 + "\n" + title2 + "\n" + write2);
                    System.out.println(weather2 + "\n" + title2 + "\n" + write2);
                } else {
                    JOptionPane.showMessageDialog(f, "다시 입력하십시오.");

                }

                //파일도 만들어주고, 스트림으로 데이터를 저장까지 해주는 기능을 부품!
                try {
                    FileWriter file = new FileWriter(weather2 + ".txt");
                    file.write(weather2 + "\n");
                    file.write(title2 + "\n");
                    file.write(write2 + "\n");
                    file.close();
                    JOptionPane.showMessageDialog(f,"파일 저장 성공!");
                } catch (IOException ex) {
                    System.out.println("파일과 관련된 문제가 생김.");
                }


            }
        });

        f.setVisible(true);
    }
}
