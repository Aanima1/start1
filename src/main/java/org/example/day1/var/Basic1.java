package org.example.day1.var;

public class Basic1 {
    public static void main(String[] args) {
        System.out.println("기본형 연습");
        // 기본형 4가지 : 정수, 실수, 문자1, 논리
        // 정수 : byte(-128 ~ 127),short(+- 30000), int(+- 300000),
        int age = 100;
        double height = 88.8;
        char gender = '남';
        boolean married = true; //false
        System.out.println("나이는 "+age);
        System.out.println("키는 "+height);
        System.out.println("성별은 "+gender);
        System.out.println("결혼 여부는 "+married);
    }
}
