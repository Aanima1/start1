package org.example.day4.array;

import java.util.Random;

public class 토익문제채점 {
    public static void main(String[] args) {
        // 1. 답안 배열, 내답 배열
        // 2. Random 이용해서 1~4까지 범위로 하여 배열에 990개를 넣으세요
        // 3. 답안과 내 답의 인덱스값을 각각 비교해서 맞으면 1점
        // 4. 총점을 출력해주세요.

        int[] me = new int[990]; // Ctrl + D 한 줄 복사.
        int[] answer = new int[990];

        Random r = new Random();

        int jumsu = 0;
        for (int i = 0; i < me.length; i++) {
            me[i] = r.nextInt(4) + 1;
            answer[i] = r.nextInt(4) + 1;
            if (me[i] == answer[i]) {
                jumsu++;
            }
        }
        System.out.println("번호:\t답안:\t내답:");
        System.out.println("-------------------------");
        for (int i = 0; i < me.length; i++) {
            System.out.println(i+1+"\t\t"+answer[i]+"\t\t"+me[i]);
        }
        System.out.println("내 점수 :" +jumsu);


    }
}
