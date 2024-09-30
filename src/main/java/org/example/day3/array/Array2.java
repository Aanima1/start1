package org.example.day3.array;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        //우리 가족 정보를 배열에 넣어보자
        //5명, 이름, 나이, 키, 성별, 아침밥 여부

        String[] names = {"홍길동", "홍길산", "홍길순", "홍순동", "홍길암"};
        //for-each 하나씩 앞에서부터 끝까지
        for(String s : names){ // String s는 하나만 만들어줌.
            System.out.println(s);
        }
        System.out.println(Arrays.toString(names)); // 배열에 있는 것을 한번에 확인하는 코드

        int[] age = {17, 22, 26, 50, 55};
        for(int x : age){
            System.out.println(x);
        }
        System.out.println(Arrays.toString(age));


        double[] height = {155, 166, 177.6, 186.6, 166, 177.7};
        for(double y : height){
            System.out.println(y);
        }
        System.out.println(Arrays.toString(height));

        String[] sex = {"M", "F", "M", "F", "M"};
        for(String z : sex){
            System.out.println(z);
        }
        System.out.println(Arrays.toString(sex));

        boolean[] eat = {true, false, true, false, true};
        for(boolean k : eat){
            System.out.println(k);
        }
        System.out.println(Arrays.toString(eat));


//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//            System.out.println(age[i]);
//            System.out.println(height[i]);
//            System.out.println(sex[i]);
//            System.out.println(eat[i]);
//            System.out.println("------------------");
//        } //for


        System.out.println(names.length);

        System.out.println(names[names.length-1]);

    }
}
