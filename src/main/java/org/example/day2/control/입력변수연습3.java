package org.example.day2.control;

import java.util.Scanner;

public class 입력변수연습3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("나의 이름은?");
        String name = sc.next();

        System.out.println("나의 키는?");
        double height = sc.nextDouble();

        System.out.println("나의 몸무게는?");
        double weight = sc.nextDouble();

        System.out.println("나는 저녁을 먹었나요?");
        boolean dinner = sc.nextBoolean();

        System.out.println("나의 좌우명은?");
        sc.nextLine(); // 위에 쳤던 엔터를 처리할 수 있는 것
        String msg = sc.nextLine();

        System.out.println("내 이름은 "+ name +"입니다."+ "\n" + "내 내년 키는 "+ height + "\n" + "내 내년 몸무게는 "+ weight + "\n" + "나는 저녁을 " + dinner + "\n" + "나의 좌우명은 " + msg );

        sc.close();


    }
}
