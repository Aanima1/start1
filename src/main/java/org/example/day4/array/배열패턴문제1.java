package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class 배열패턴문제1 {
    public static void main(String[] args) {
        //1. 배열을 만들어서 나중에 반복문으로 데이터 많이 넣기
        // 1-1. length가 10인 int배열 생성
        // 1-2. Random을 이용하여 값을 넣기(범위 1~100, r.nextInt(100) + 1)
        //      Random의 씨앗값(seed)는 55
        // 1-3. 생성된 배열 요소 전체 출력
        int[] num = new int[10];
        Random r = new Random(55);


        for (int i = 0; i < num.length; i++) {
            num[i] = r.nextInt(100) + 1;
        }

        System.out.println(Arrays.toString(num)); //비파괴형
        Arrays.sort(num); //파괴형, 원본 배열을 오름차순으로 정렬
        System.out.println(Arrays.toString(num));

        //2. 배열에 있는 값을 꺼내어 누적
        // 2-1. 감소하여 누적하는 변수 minus선언하여 초기화
        // 2-2. 배열에 있는 값을 꺼내어 계속 감소
        // 2-3. minus값 출력
        int minus = 0;
        for (int i = 0; i < num.length; i++) {
            minus = minus - num[i];
        }

        System.out.println(minus);

        //3. 배열에 있는 값을 반복해서 처리하는데 조건이 있는 경우
        // 3-1. 더해서 누적하는 함수 sum선언하여 초기화
        // 3-2. 배열에 있는 값 중 50보다 큰 것만 누적
        // 3-3. sum값 출력
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 50) {
                sum = sum + num[i];
            } //if
        } //for
        System.out.println(sum);


        //4. 배열에 있는 값을 가지고 위치를 찾는 경우
        // 4-1. 배열내에 80보다 큰 값의 위치를 맨 앞부터 하나만 찾아 위치 프린트
        // 4-2. 80보다 큰 값을 찾으면 반복문 종료
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 80) {
                System.out.println(i + 1 + "번째에서 발견!");
                break;
            } //if
        } // for
    }
}
