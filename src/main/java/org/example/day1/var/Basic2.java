package org.example.day1.var;

public class Basic2 {
    public static void main(String[] args) {
        System.out.println("기본형 연습2");
        // 기본형 4가지 : 정수, 실수, 문자1, 논리
        // 가을이다. 관련된 데이터를 기본형 4가지 넣고 프린트
        // 상수도 추가. final. 변수명 대문자로

        final char COLOR = 'b';
        int month = 9;
        double starThis = 22.5; // 낙타 표기법, package, class, var
        boolean rain = true;

        System.out.println("색: "+COLOR);
        System.out.println("월: "+month);
        System.out.println("근처 맛집 평점: "+starThis);
        System.out.println("비 오는 여부: "+rain);

        month = 10;
//        COLOR = 'C';

        int nowTime = 0;    //초기화(초기값)
        //변수는 반드시 초기화를 시켜주세요.
        nowTime = 18;
        System.out.println(nowTime);

    }
}
