package org.example.day2.control;

import java.util.Scanner;

public class 입력변수연습2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수 2개를 입력받아서 첫번쨰 숫자가 두번째 숫자보다 큰 지 비교해서 출력
        System.out.println("정수1 >>");
        int x1 = sc.nextInt();

        System.out.println("정수2 >>");
        int x2 = sc.nextInt();

        System.out.println(x1 > x2);


        sc.close();


    }
}
