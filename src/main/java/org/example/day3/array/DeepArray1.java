package org.example.day3.array;

import java.util.Arrays;
import java.util.Random;

public class DeepArray1 {
    public static void main(String[] args) {

        Random r = new Random();
        int[] arr = new int[20];

        for (int i = 0; i < 20; i++) {
            int x = r.nextInt(100);
            arr[i] = arr[x];
        }

        System.out.println("배열 프린트 : " + Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("오름차순 정렬 후 프린트 : " + Arrays.toString(arr));

        //arrays.sort

//        System.out.println(Arrays.sort(arr));
    }
}
