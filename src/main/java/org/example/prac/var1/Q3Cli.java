package org.example.prac.var1;

import java.util.Scanner;

public class Q3Cli {
    public static void main(String[] args) {
        // 수학 점수와 영어 점수의 평균을 확인하는 프로그램.
        // 점수 횟수는 내가 입력하는 만큼 판단
        Scanner sc = new Scanner(System.in);
        System.out.println("안녕하십니까. 점수 평균 확인 프로그램입니다.");
        System.out.println("+---------------------------------------------------------------------------+");
        System.out.println("| 메뉴) 1. 학생 수 입력\t| 2. 수학 점수 입력\t| 3. 영어 점수 입력" + "\t\t\t\t|\n" + "|\t 4. 수학 평균 확인\t| 5. 영어 평균 확인\t| 6. 모든 인원의 점수 평균 확인\t|");
        System.out.println("|\t 0. 종료\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+---------------------------------------------------------------------------+");
        System.out.println();

        int menu = 0;
        int students = 0;
        int mathSum = 0;
        int engSum = 0;
        double mathAvg = 0;
        double engAvg = 0;


        boolean flag = false;

        while (!flag) {
            System.out.print("메뉴를 선택하세요 : ");
            menu = sc.nextInt();
            mathAvg = (double) mathSum / students;


            try {
                if (menu < 0 || menu > 7) {
                    System.out.println("메뉴를 다시 선택하세요.");
                } else if (menu == 0) {
                    System.out.println("프로그램이 종료됩니다.");
                    flag = true;
                } else if (menu == 1) {
                    System.out.print("학생 수를 입력하시오: ");
                    students = sc.nextInt();
                    continue;
                } else if (menu == 2) {
                    for (int i = 0; i < students; i++) {
                        System.out.print("수학 점수 입력 : ");
                        mathSum += sc.nextInt();
                    }
                } else if (menu == 3) {
                    for (int i = 0; i < students; i++) {
                        System.out.print("영어 점수 입력 : ");
                        engSum += sc.nextInt();
                    }
                } else if (menu == 4) {
                    System.out.println("수학 평균: " + (double) (mathSum / students));
                } else if (menu == 5) {
                    System.out.println("영어 평균: " + (double) (engSum / students));
                } else if (menu == 6) {
                    System.out.println("전체 평균: " + (double)(mathSum + engSum) / (2 * students));
                }

            } catch (NumberFormatException ex) {
                System.out.println("숫자로 입력하세요.");
            } // try-catch


        } //while


        sc.close();

    }
}
