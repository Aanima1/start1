package org.example.day1.var;

public class Basic3 {
    public static void main(String[] args) {
        System.out.println("기본형 연습3");
        //기본형 4가지 : 정수, 실수, 문자1, 논리

        // 정수 : byte(127), short, int, long
        byte age = 120; // 전제조건 120
        short count = 25000; // +-30000
        int money = 1000000; //+-21억
        long bank = 2200000000L; //그냥 치면 int로 인식. 뒤에 l, L 붙여주기

        //실수 : float, double
        float weight = 55.5F; //그냥 55.5로 치면 55.5000000000~~로 인식. 뒤에 F or f 붙이기
        double height = 188.88888;

        String name = "김주일"; //0글자 이상 (문자열), 기본형이 아니라 대문자로 시작. 우,리,은,행을 실로 엮은 느낌이라 String
        String job = "자바 프로그래머";

        //내가 미래에 가질 재산. 프린트(money+bank)
        //홍길동은 자바 프로그래머이다. 프린트(name+job)

        System.out.println(name+"이 미래에 가질 재산: "+money+bank);
        System.out.println(name+"은 "+job+"이다");


    }
}
