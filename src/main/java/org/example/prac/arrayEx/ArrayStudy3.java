package org.example.prac.arrayEx;

import java.util.Arrays;
import java.util.Random;

public class ArrayStudy3 {
    public static void main(String[] args) {
//        3. int[] n = new int[1000];
//        random한 값 1~1000까지 배열에 넣어 전체 출력(씨앗값 : 44)
//        3-1. 첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 출력
//        3-2. 전체 합계와 평균 출력

        int[] n = new int[1000];
        Random r = new Random(44);

        int allSum = 0;

        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(1000) + 1;
            allSum = allSum + n[i];
        }

        double avr = (double) allSum / n.length;

        System.out.println(Arrays.toString(n));
        System.out.println("---------------------------");

        int eachSum = 0;
        for (int i = 0; i < n.length; i++) {
            if(i == 0){
                System.out.println(n[i]);
                eachSum = eachSum + n[i];
            }
            if(i == 2){
                System.out.println(n[i]);
                eachSum = eachSum + n[i];
            }
            if(i == 4){
                System.out.println(n[i]);
                eachSum = eachSum + n[i];
            }
            if(i == 99){
                System.out.println(n[i]);
                eachSum = eachSum + n[i];
            }
            if(i == 989){
                System.out.println(n[i]);
                eachSum = eachSum + n[i];
            }
        } //for
        System.out.println(eachSum);
        System.out.println(allSum);
        System.out.println(avr);


    }
}
