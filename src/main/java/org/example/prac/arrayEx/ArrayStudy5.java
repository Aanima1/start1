package org.example.prac.arrayEx;

import java.util.Random;

public class ArrayStudy5 {
    public static void main(String[] args) {
        /*
        5. random한 값 1부터 100까지 배열에 넣어 전체 출력(씨앗값 : 555), length는 1000
        80이상인 개수, 70~79인 수 개수, 50~69인 수 개수, 49보다 작은 수 개수 카운트하여 출력*/
        int[] n = new int[1000];
        Random r = new Random(555);
        int count1 = 0, count2 = 0, count3 = 0, count4 =0;

        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(100) + 1;

            if(n[i] >= 80){
                count1++;
            }
            if(n[i] >= 70 && n[i] < 80){
                count2++;
            }
            if(n[i] >= 50 && n[i] < 70){
                count3++;
            }
            if(n[i] < 49){
                count4++;
            }
        }

        System.out.println("80이상인 개수: "+count1);
        System.out.println("70~79인 수 개수: "+count2);
        System.out.println("50~69인 수 개수: "+count3);
        System.out.println("49보다 작은 수 개수: "+count4);


    }
}
