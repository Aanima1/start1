package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 웹툰순위 {
    static int start = 2;
    //변수가 선언된 위치에서 포함한 곳 안에서 사용 가능.

    public static void main(String[] args) {

        JFrame f = new JFrame();
        f.setTitle("웹툰 순위 - 네이버");
        f.setSize(400, 470);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //데이터 준비 --> 배열 (같은 속성, 같은 타입, 많을 때 사용

        String[] title = {"윈드 브레이커", "천재 타자가 강속구를 숨김", "펜홀더", "위닝샷", "낫오버"};
        String[] img = {"1.png", "2.png", "3.png", "4.png", "5.png"};
        double[] jumsu = {9.87, 9.76, 9.45, 9.33, 9.21};


        // 입력 -> 처리 -> 출력

        Font ft = new Font("궁서", Font.BOLD, 25);

        //텍스트 3개 들어갈 자리 (위, 아래, 이미지)
        JLabel top = new JLabel();
        top.setText(title[start]);
        top.setFont(new Font("궁서", Font.BOLD, 35));
        top.setBackground(Color.YELLOW);

        JLabel under = new JLabel();
        under.setText(jumsu[start] + "");   //결과가 하나라도 String -> String
        //String.valueOf(jumsu[2]);
        under.setFont(ft);
        under.setBackground(Color.YELLOW);

        JLabel center = new JLabel();
//        center.setText("이미지 포스터");
        ImageIcon icon = new ImageIcon(img[start]);
        center.setIcon(icon);


        JButton left = new JButton();
        left.setText("<<");
        left.setBackground(Color.GREEN);
        left.setForeground(Color.BLUE);
        left.addActionListener(new ActionListener() {
            //addActionListener (처리하는 부품)는 버튼을 클릭했을 때 처리하는 기능을 더함.
            @Override
            public void actionPerformed(ActionEvent e) {
                // 이 actionPerformed()가 자동으로 내가 클릭했을 때 실행되는 구문.
                System.out.println("왼쪽 버튼을 눌렀군");
                if (start > 0){
                    start--;
                    top.setText(title[start]);
                    under.setText(jumsu[start] + "");
                    ImageIcon icon = new ImageIcon(img[start]);
                    center.setIcon(icon);

                }else{
                    JOptionPane.showMessageDialog(f,"시작 페이지 입니다.");
                }
            }
        });

        JButton right = new JButton();
        right.setText(">>");
        right.setBackground(Color.GREEN);
        right.setForeground(Color.BLUE);
        right.addActionListener(new ActionListener() {
            //addActionListener (처리하는 부품)는 버튼을 클릭했을 때 처리하는 기능을 더함.
            @Override
            public void actionPerformed(ActionEvent e) {
                // 이 actionPerformed()가 자동으로 내가 클릭했을 때 실행되는 구문.
                System.out.println("오른쪽 버튼을 눌렀군");
                if(start < 4){
                    start++;
                    top.setText(title[start]);
                    under.setText(jumsu[start] + "");
                    ImageIcon icon = new ImageIcon(img[start]);
                    center.setIcon(icon);
                }else if (start == 4){
                    JOptionPane.showMessageDialog(f, "마지막 입니다.");
                }
            }
        });


        f.add(top, BorderLayout.NORTH);
        f.add(under, BorderLayout.SOUTH);
        f.add(center, BorderLayout.CENTER);
        f.add(left, BorderLayout.WEST);
        f.add(right, BorderLayout.EAST);

        f.setVisible(true);
    }
}
