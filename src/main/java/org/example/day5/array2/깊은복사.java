package org.example.day5.array2;

import java.util.Arrays;

public class 깊은복사 {
    public static void main(String[] args) {
        String[] sub = {"국어", "영어", "수학", "컴퓨터", "회화"};
        int[] jumsu1 = {44, 66, 22, 99, 100};
        int[] jumsu2 = jumsu1.clone();

        jumsu2[0] = 22; jumsu2[2] = 88;

        System.out.println(Arrays.toString(jumsu1));
        System.out.println(Arrays.toString(jumsu2));

        int same = 0;
        int up = 0;

        for (int i = 0; i < jumsu2.length; i++) {
            if(jumsu1[i] == jumsu2[i]){
                same++;
            }
            if(jumsu1[i] < jumsu2[i]){
                up++;
            }
        }
        System.out.println(same);
        System.out.println(up);

        for (int i = 0; i < jumsu2.length; i++) {
            if(jumsu1[i] < jumsu2[i]){
                System.out.println(jumsu1[i]);
            }
        }

    }
}
