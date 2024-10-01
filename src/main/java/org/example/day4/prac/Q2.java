package org.example.day4.prac;

import java.util.Arrays;
import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        Random r = new Random(100);

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = r.nextInt(50 + 1);
        }
//        System.out.println(Arrays.toString(arr1));

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = r.nextInt(50) + 51;
        }
//        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        System.out.println(arr1[arr1.length - 1] + arr2[arr2.length - 1]);
        System.out.println(arr1[0] + arr2[0]);


    }
}
