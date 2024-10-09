package org.example.prac.var1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3CliGpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("안녕하십니까. 점수 평균 확인 프로그램입니다.");
        System.out.println("+---------------------------------------------------------------------------+");
        System.out.println("| 메뉴) 1. 학생 수 입력\t| 2. 수학 점수 입력\t| 3. 영어 점수 입력" + "\t\t\t\t|\n" + "|\t 4. 수학 평균 확인\t| 5. 영어 평균 확인\t| 6. 모든 인원의 점수 평균 확인\t|");
        System.out.println("|\t 0. 종료\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|");
        System.out.println("+---------------------------------------------------------------------------+");
        System.out.println();

        int menu = -1;
        int students = 0;
        ArrayList<Integer> mathScores = new ArrayList<>();
        ArrayList<Integer> englishScores = new ArrayList<>();

        boolean flag = false;

        while (!flag) {
            System.out.print("메뉴를 선택하세요 : ");
            try {
                menu = Integer.parseInt(sc.nextLine());

                switch (menu) {
                    case 0:
                        System.out.println("프로그램이 종료됩니다.");
                        flag = true;
                        break;
                    case 1:
                        System.out.print("학생 수를 입력하시오: ");
                        students = Integer.parseInt(sc.nextLine());
                        if (students <= 0) {
                            System.out.println("유효한 학생 수를 입력하세요.");
                        }
                        break;
                    case 2:
                        if (students == 0) {
                            System.out.println("먼저 학생 수를 입력하세요.");
                            break;
                        }
                        mathScores.clear();
                        for (int i = 0; i < students; i++) {
                            System.out.print("수학 점수 입력 : ");
                            mathScores.add(Integer.parseInt(sc.nextLine()));
                        }
                        break;
                    case 3:
                        if (students == 0) {
                            System.out.println("먼저 학생 수를 입력하세요.");
                            break;
                        }
                        englishScores.clear();
                        for (int i = 0; i < students; i++) {
                            System.out.print("영어 점수 입력 : ");
                            englishScores.add(Integer.parseInt(sc.nextLine()));
                        }
                        break;
                    case 4:
                        if (mathScores.isEmpty()) {
                            System.out.println("수학 점수를 먼저 입력하세요.");
                        } else {
                            double mathAvg = mathScores.stream().mapToInt(Integer::intValue).average().orElse(0);
                            System.out.println("수학 평균: " + mathAvg);
                        }
                        break;
                    case 5:
                        if (englishScores.isEmpty()) {
                            System.out.println("영어 점수를 먼저 입력하세요.");
                        } else {
                            double engAvg = englishScores.stream().mapToInt(Integer::intValue).average().orElse(0);
                            System.out.println("영어 평균: " + engAvg);
                        }
                        break;
                    case 6:
                        if (mathScores.isEmpty() || englishScores.isEmpty()) {
                            System.out.println("모든 점수를 먼저 입력하세요.");
                        } else {
                            double totalAvg = (mathScores.stream().mapToInt(Integer::intValue).sum() + englishScores.stream().mapToInt(Integer::intValue).sum()) / (double)(2 * students);
                            System.out.println("전체 평균: " + totalAvg);
                        }
                        break;
                    default:
                        System.out.println("잘못된 메뉴 선택입니다. 다시 선택하세요.");
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자로 입력하세요.");
            }
        }

        sc.close();
    }
}