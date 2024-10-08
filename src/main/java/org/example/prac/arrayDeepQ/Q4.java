package org.example.prac.arrayDeepQ;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] seats = new boolean[10];
        int count = 0;
        int price = 10000;

        while (true) {
            System.out.print("현재 좌석 상태:\n");
            for (int i = 0; i < seats.length; i++) {
                System.out.print((i + 1) + (seats[i] ? "(*) " : "() "));
            }
            System.out.println("\n예매할 좌석 번호를 입력하세요 (종료하려면 0 입력): ");

            int seatNum = sc.nextInt();
            if (seatNum == 0) break;

            if (seatNum < 1 || seatNum > 10) {
                System.out.println("잘못된 번호입니다. 다시 입력하세요.");
                continue;
            }

            if (seats[seatNum - 1]) {
                System.out.println(seatNum + "번 좌석이 이미 예매되었습니다.");
            } else {
                seats[seatNum - 1] = true;
                count++;
                System.out.println(seatNum + "번 좌석이 예매되었습니다.");
            }
        }

        int totalPrice = count * price;
        System.out.println("총 예매 좌석 수: " + count);
        System.out.println("총 예매 금액: " + totalPrice + "원");

        sc.close();

    }

}