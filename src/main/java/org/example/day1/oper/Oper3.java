package org.example.day1.oper;

import javax.swing.*;

public class Oper3 {
    public static void main(String[] args) {
        //정수1 입력 -- a변수, 333
        //정수2 입력 -- b변수, 222

        //입력을 받은 데이터를 int로 각각 변환하여 a2, b2로 저장
        //두 입력값의 평균을 구하시오.(실수로)

        String a = JOptionPane.showInputDialog("정수 1을 입력하시오.");
        String b = JOptionPane.showInputDialog("정수 2를 입력하시오.");

        int a2 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);

        int sum = a2+b2;
        double result = (double)sum/2; //캐스팅 타입변환
        System.out.println("두 입력값의 평균: "+result);
        JOptionPane.showMessageDialog(null, result); // 위치->null : 가운데에 뜸



    }
}
