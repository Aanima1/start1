package org.example.day2.review;

public class Test1 {
    public static void main(String[] args) {
        // 기본형 변수를 정리 - 정수, 실수, 문자1, 논리
        float temp = 23.5f; // ==> double
        byte date = 26; // -128 ~ 127 ->256가지의 데이터 ==> int
        final char DAY = '목';
        boolean food = false;

        String roomNo = "강의장 6호";

        // 콘솔로 변수 데이터를 프린트
        System.out.println("Temperature: " + temp);
        System.out.println("Date: " + date);
        System.out.println("Day: " + DAY);
        System.out.println("Food available: " + food);
        System.out.println("Room Number: " + roomNo);
    }
}