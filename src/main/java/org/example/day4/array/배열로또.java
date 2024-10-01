package org.example.day4.array;

import java.util.Arrays;
import java.util.Random;

public class 배열로또 {
    public static void main(String[] args) {
        int[] lotto = new int[1000];
        Random r = new Random(42);
        //범위는 1부터 45까지

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = r.nextInt(45) + 1;
        }
        System.out.println(Arrays.toString(lotto)); // ==> p(lotto);

        //카운트 누적 변수

        int count = 0;
        for (int i = 0; i < lotto.length; i++) {
            if (lotto[i] >= 30) {
                count++;
            }
        }
        System.out.println(count);


    }
}
