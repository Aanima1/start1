package org.example.prac.arrayDeepQ;

import java.util.Arrays;
import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        int[] n = new int[20];
        Random r = new Random(44);

        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(100) + 1;
        }
        System.out.println("배열 프린트: " + Arrays.toString(n));
        Arrays.sort(n);
        System.out.println("오름차순 정렬 후 프린트: " + Arrays.toString(n));
        System.out.println("MAX: " + n[n.length - 1]);
        System.out.println("MIN: " + n[0]);

    }
}
