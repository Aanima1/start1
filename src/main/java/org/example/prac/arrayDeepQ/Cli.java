package org.example.prac.arrayDeepQ;

import java.util.Scanner;

public class Cli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[10];
        int price = 10000;
        int count = 0;

        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("1" + "\t" + "2" + "\t" + "3" + "\t" + "4" + "\t" + "5" + "\t" + "6" + "\t" + "7" + "\t" + "8" + "\t" + "9" + "\t" + "10");
            System.out.println("----------------------------------------");
            for (int i = 0; i < seats.length; i++) {
                System.out.print(seats[i] ? "1\t" : "0\t");
            }
            System.out.println();
            System.out.println("----------------------------------------");
            System.out.println("예매할 좌석 번호를 입력");
            System.out.print("(종료 0번>>>) ");
            int num = sc.nextInt();

            if (num == 0) break;
            if (num < 1 || num > 10) {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                continue;
            }
            if (seats[num - 1]) {
                System.out.println("이미 예매된 좌석입니다.");
            } else {
                seats[num - 1] = true;
                count++;
                System.out.println(num + "번 좌석이 예매되었습니다.");
            }
        }
        System.out.println("예매 시스템을 종료합니다.");
        System.out.println("당신의 총 예매수는 " + count + "매");
        System.out.println("당신의 총 금액은 " + price * count + "원");

        sc.close();
    }
}
