package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class 배열패턴 {
    public static void main(String[] args) {
        // 1. 배열을 만들어서 나중에 반복문으로 데이터 많이 넣기
        int[] jumsu = new int[5]; // {0,0,0,0,0}
        Random r = new Random(100); //아무값이나 만들어주는 부품, 100->씨앗값 => 뒤에 나올 때 값을 동일하게 사용할 수 있다.
        for (int i = 0; i < jumsu.length; i++) {
            //String num = JOptionPane.showInputDialog("숫자를 입력하시오.");
            //jumsu[i] = Integer.parseInt(num); // parse : 분석하다. parseInt -> 분석해서 숫자로 바꿀 수 있는 것만 인트로 변환
            jumsu[i] = r.nextInt(100);  // -21억 ~ 21억, 0~99 + 1
        }
        System.out.println(Arrays.toString(jumsu));


        // 2. 배열에 있는 값을 꺼내어 누적
        int sum = 0; //누적하는 변수는 반복문 내에 넣지 않는다.
        for (int x : jumsu) {
            sum = sum + x;
            // 앞의 sum : 새값까지 누적된 값
            // 뒤의 sum : 이전까지 더해진 값
        }
        System.out.println(sum);


        // 3. 배열에 있는 값을 반복해서 처리하는데 조건이 있는 경우
        int sum2 = 0;
        for (int x : jumsu) { // int x 변수 : for문 안에서만 사용가능. 밖에서 인식 못함. -> 선언위치 >> 변수가 사용될 수 있는 범위
            if (x > 80) {
                sum2 = sum2 + x; //sum2+= x;
            }
        }
        //코드 정리 (코드 포맷팅) Ctrl + Alt + L
        System.out.println(sum2);


        // 4. 배열에 있는 값을 가지고 위치를 찾는 경우
        for (int i = 0; i < jumsu.length; i++) {
            if (jumsu[i] == 88) {
                //88이 하나인 경우
                System.out.println("88 찾음.");
                System.out.println(i + 1 + "번째에 있음");
                break; //반복문의 break
            }
        }


    }
}
