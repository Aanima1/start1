package org.example.day2.control;

import java.util.Scanner;

public class 입력변수연습1 {
    public static void main(String[] args) {
        // 수동 import ==> art + Enter
        Scanner sc = new Scanner(System.in); // 콘솔로 입력 -> keyboard
        System.out.println("이름 입력>>");
        String name = sc.next(); // 한 단어만 입력, 홍길동, spaceBar도 인식
        System.out.println("나이 입력>>");
        int age = sc.nextInt();
        System.out.println("키 입력>>");
        double w = sc.nextDouble(); // String --> double
        System.out.println(name + " " + age + " " + w);


        sc.close(); // 강물을 닫아주기
    }
}
