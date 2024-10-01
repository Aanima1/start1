package org.example.day4.array;

import java.util.Random;

public class ArrayPrac3 {
    public static void main(String[] args) {
//        3. int[] n = new int[1000];
//        random한 값 1~1000까지 배열에 넣어 전체 출력(씨앗값 : 44)
//        3-1. 첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 출력
//        3-2. 전체 합계와 평균 출력

        int[] n = new int[1000];
        Random r = new Random(44);

        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(1000) + 1;
            if(i ==0){

            }


        }





        System.out.println(n[0] + " " + n[2] + " " + n[4] + " " + n[99] + " " + n[989]);

        int sum = 0;
        double avr = 0;

        for (int x : n) {
            sum = sum + x;
        }
        System.out.println(sum);

        System.out.println((double)sum/1000);

        System.out.println();

    }
}
