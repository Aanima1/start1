package org.example.day3.order;

import java.util.Scanner;

public class Input1 {
    public static void main(String[] args) {
        //입력
        //RAM에 있어야 함.
//        int x = 100;
        Scanner sc = new Scanner(System.in); // system -> 내 컴퓨터 , in -> 내 컴퓨터의 기본장치 키보드로 입력을 받겠다.
        System.out.print("나이 입력 >> "); //println() : 엔터 후 출력, printf():소수점 맞춰서 잘라서 해라
        int age = sc.nextInt(); // 모든 입력 타입을 컴퓨터는 String으로 인식. 계산하려면 int로 변경!

        System.out.print("아침을 먹었는지 입력(true/false) >> ");
        boolean result = sc.nextBoolean();


        //처리 ==> cpu
        int nextAge = age + 1;
        String text = null; //주소가 없음 (널), 기본형이 아닌 데이터는 null로 초기화

        if (result) {
            text = "점심을 조금 먹어도 되겠네요!";
        } else {
            text = "점심을 많이 먹어야 되겠네요!";
        }

        //출력
        System.out.println("내년 나이는 " + nextAge + "세");
        System.out.println("아침 식사 여부 결과: " + result + " " + text);

    }
}
