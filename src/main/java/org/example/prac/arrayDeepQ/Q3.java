package org.example.prac.arrayDeepQ;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stNum = 0;
        int allSum = 0;
        double avr = 0;

        while (true) {
            System.out.println("-----------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------------------");
            System.out.print("선택> ");
            int num = sc.nextInt();
            String[] st = new String[num];
            int[] scores = new int[num];

            if (num == 5) {
                System.out.println("시스템 종료합니다.");
                break;
            }
            if (num == 1) {
                System.out.print("학생수> ");
                stNum = sc.nextInt();
            } else if (num == 2) {
                allSum = 0;
                for (int i = 0; i < stNum; i++) {
                    System.out.print("scores[" + i + "]>");
                    scores[i] = sc.nextInt();
                    allSum = allSum + scores[i];
                } //for

            } else if (num == 3) {
                for (int i = 0; i < stNum; i++) {
                    System.out.println("scores[" + i + "]: "+ scores[i]);

                }
            } else if (num == 4) {
                Arrays.sort(scores);
                System.out.println("최고 점수 : " + scores[scores.length - 1]);
                System.out.println("평균 점수 : " + (double) allSum / stNum);
            }else{
                System.out.println("점수를 잘못 입력하셨습니다.");
            }


        }


        sc.close();
    }
}
