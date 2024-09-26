package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class 부품사용1 {
    public static void main(String[] args) {
        JFrame f = new JFrame();        //무더기 영역에 있는 JFrame을 가져오기. -> 벽돌
        JButton b1 = new JButton();     // b1에는 주소가 있다.
        JButton b2 = new JButton();

        f.setSize(300, 300);

        b1.setText("나를 클릭!");
        b2.setText("나를 클릭!!");
        b1.setBackground(Color.RED);
        b2.setBackground(Color.GREEN);
        b1.setForeground(Color.ORANGE);
        b2.setForeground(Color.BLUE);

        Font font = new Font("궁서", Font.BOLD, 20);
        b1.setFont(font);
        b2.setFont(font);


        //배치해주는 부품.
        //물 흐르는 것처럼 순서대로 다 붙여주는 레이아웃
        FlowLayout f1 =  new FlowLayout();
        f.setLayout(f1);

        f.add(b1); //add만 입력하면 가운데로 자동 배치 -> 두개 이상 입력하면 겹침
        f.add(b2);

        //맨끝에 넣어주기
        f.setVisible(true); // JFrame f를 set View 보여줘 => 논리로 (T or F)

    }
}
