package org.example.day1.prac;

import javax.swing.*;

public class OperPrac {
    public static void main(String[] args) {
        //이름 입력창
        //나이 입력창
        //3년뒤 나이 화면에 출력

        String name = JOptionPane.showInputDialog("이름을 입력하시오.");
        String age = JOptionPane.showInputDialog("나이를 입력하시오.");

        int age2 = Integer.parseInt(age.replaceAll(" ", ""));
        // 입력 받을 때 spaceBar도 인식! ->

        System.out.println(name + " " + age2 + "\n" + "3년 뒤 나이는? " + (age2 + 3));

    }
}
