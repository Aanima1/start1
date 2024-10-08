/*
package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class 영화예매시스템 {
    static int count = 0;
    static String sum = " ";

    public static void main(String[] args) {
        int price = 10000;

        JFrame f = new JFrame();
        f.setSize(560,730);
        f.setTitle("영화 예매 시스템");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        FlowLayout flow = new FlowLayout(); // 강물 흐르듯이 연결
        f.setLayout(flow);




        for (int i = 0; i < 100; i++) {
            JButton seats = new JButton();
            seats.setText(i + "");
            f.add(seats);


            seats.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //버튼 클릭했을 때 실행되는 내용
                    //버튼 클릭하면 addActionListener 안에 있는 actionPerformed()라는 함수가 자동 실행.
                    String s = e.getActionCommand(); // 버튼 위에 있는 글자를 가지고 온다.
                    System.out.println(s);
                    JOptionPane.showMessageDialog(f,s+"번 예매됨.");
                    seats.setEnabled(false);    // 버튼을 더이상 누를 수 없게 만듬.
                    seats.setBackground(Color.RED);

                    count++;
                    sum = sum + s + " ";
                }
            });


        }

        JButton pay = new JButton();
        pay.setText("결제하기");
        pay.setBackground(Color.YELLOW);
        f.add(pay,BorderLayout.PAGE_END);

        pay.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                StringBuilder seatList = new StringBuilder();
                for(String seat : sum){

                    seatList.append(seat).append(" ");

                }
                JOptionPane.showMessageDialog(f, "당신이 예매한 좌석은 "+seatList.toString());
                JOptionPane.showMessageDialog(f, "결제할 금액은 "+(price*count)+"입니다.");

                int confirm = JOptionPane.showConfirmDialog(f,"결제를 완료하시겠습니까?","결제 확인",JOptionPane.YES_NO_OPTION);
                if(confirm == JOptionPane.YES_NO_OPTION){
                    System.exit(0);
                }

            }
        });



        f.setVisible(true);
    }
}
*/

package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 영화예매시스템 {
    static int count = 0; //예매수 누적용
    static String sum = ""; //좌석번호 누적용

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(560, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flow = new FlowLayout();
        frame.setLayout(flow);//add()한 순서래도 물흐르듯이 뒤에다 붙여줌.!

        for (int i = 0; i < 100; i++) {
            JButton button = new JButton();
            button.setText(i + "");
            frame.add(button);


            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //버튼클릭했을 때 실행되는 내용!
                    //버튼클릭하면 ActionListener안에 있는 actionPerformed()라는
                    //함수가 자동 실행!
                    String s = e.getActionCommand();//버튼 위에 있는 글자를 가지고 온다.
                    System.out.println(s);
                    JOptionPane.showMessageDialog(frame, s+"번 예매됨.");
                    button.setEnabled(false);
                    button.setBackground(Color.red);
                    count++;//예매수 카운트
                    sum = sum + s + " "; //sum += s + " ";
                }
            });
        }

        JButton pay = new JButton();
        pay.setText("결제하기");
        frame.add(pay);
        pay.setBackground(Color.red);
        pay.setForeground(Color.yellow);

        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, count * 10000 + "원 결제금액입니다. \n좌석번호는 " + sum);
            }
        });
        //맨 끝!
        frame.setVisible(true);
    }
}