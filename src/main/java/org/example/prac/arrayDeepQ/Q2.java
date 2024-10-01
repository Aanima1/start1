package org.example.prac.arrayDeepQ;

import java.util.Arrays;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        int[] n1 = new int[10];
        int[] n2 = new int[10];

        Random r = new Random(44);
        for (int i = 0; i < n1.length; i++) {
            n1[i] = r.nextInt(50) + 1;
            n2[i] = r.nextInt(50) + 51;
        }

        Arrays.sort(n1);
        Arrays.sort(n2);

        System.out.println("배열 1: " + Arrays.toString(n1));
        System.out.println("배열 2: " + Arrays.toString(n2));
        System.out.println(n1[n1.length - 1] + n2[n2.length - 1]);
        System.out.println(n1[0] + n2[0]);
    }
}
