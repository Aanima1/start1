package org.example.day3.array;

import java.util.Arrays;

public class ArrayStudy1 {
    public static void main(String[] args) {
        System.out.println("---------------1---------------");
        //1. 정수 배열을 만들어 11,22,33,44,55를 넣으세요
        //처음부터 값을 알고 있는 경우
        int[] a = {11, 22, 33, 44, 55};

        //1-1. 첫번째 값을 프린트
        System.out.println(a[0]);
        //1-2. 세번째 값을 프린트
        System.out.println(a[2]);
        //1-3. 마지막 값을 프린트
        System.out.println(a[a.length - 1]);
        //1-4. 전체 프린트
        System.out.println(Arrays.toString(a));

        System.out.println("---------------2---------------");

//        2. 실수 배열을 만들어 11.1, 22.2, 33.3을 넣으세요.
//        (처음부터 값을 알고 있는 경우)

        double[] b = {11.1, 22.2, 33.3};
//        2-1. 첫번 째 값과 두번째 값을 더해서 프린트
        System.out.println(b[0]+b[1]);
//        2-2. 첫번 째 값과 마지막 값을 더해서 프린트
        System.out.println(b[0]+b[b.length-1]);
//        2-3. 배열에 들어있는 전체 개수를 프린트
        System.out.println(b.length);
//        2-4. 전체 프린트
        System.out.println(Arrays.toString(b));

        System.out.println("---------------3---------------");

//        3. 개수가 4개인
//        문자(char) 배열을 만들어(처음에는 값을 모르고 있는 경우)
        char[] c = new char[4];

//        3-1. 첫 번째 위치에 '남'을 넣어, 첫 번째 값 프린트
        c[0] = '남';
        System.out.println(c[0]);
//        3-2. 두 번째 위치에 '여'를 넣어, 첫 번째 값 프린트
        c[1] = '여';
        System.out.println(c[1]);
//        3-3. 전체 개수와 전체 배열의 값을 프린트
        System.out.println(c.length);
        System.out.println(Arrays.toString(c));

        System.out.println("----------------4--------------");

//        4. 개수가 3개인
//        문자열(String) 배열을 만들어(처음에는 값을 모르고 있는 경우)
        String[] d = new String[3];
//        4-1. 각 인덱스의 자리에 여행가고 싶은 곳을 제일 가고 싶은 곳부터 순서대로
//        세 곳을 넣어서 저장(부산, 제주도, 전주인 경우)
        d[0] = "부산";
        d[1] = "제주도";
        d[2] = "전주";

//        for(String s : d){
//            System.out.println("");
//        }


//        4-2. 전체 프린트
        System.out.println(Arrays.toString(d));
//        4-3. 다음과 같이 프린트되도록 처리
//        내가 첫 번째 가고 싶은 곳은 부산이고, 마지막 가고 싶은 곳은 전주이다.
        System.out.println("내가 첫 번째 가고 싶은 곳은 "+d[0] +"이고, 마지막으로 가고 싶은 곳은 "+d[d.length-1]+"이다.");



    }
}
