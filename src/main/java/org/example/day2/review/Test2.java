package org.example.day2.review;

public class Test2 {
    public static void main(String[] args) {
        int x = 333;
        int y = 222;

        int sum = x + y;
        int minus = x - y;
        int mul = x * y;
        int div = x / y;
        int mod = x % y;
        System.out.println("sum = "+sum);
        // 결합 연산자는 피연산자가 하나라도 스트링!
        // 산술 연산자는 정수+정수 계산의 결과는 무조건 정수
        // 산술 연산자는 하나라도 실수이면 결과는 무조건 실수


        //비교 연산자, 논리연산자의 결과는 무조건 논리형 데이터(true/false)이다.

        System.out.println(x == y);
        System.out.println(x >= y);

        //and(&&)
        char id = 'a';
        char pw = 'b';

        System.out.println(id == 'a' && pw == 'b');
        System.out.println(id == 'a' && pw == 'c');

        //or(||)
        char pw1 = 'j';
        char pw2 = 'k';
        System.out.println(pw1 == 'j' || pw2 == 'm');

    }
}