package org.example.day5.array2;

import java.util.Scanner;

public class 인기투표 {
    public static void main(String[] args) {
        //이름 배열
        String[] name = {"아이유", "유재석", "방탄"};
        //투표수 배열
        int[] tv = new int[3];
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("인기투표 0)아이유, 1)유재석, 2)방탄, 3)종료");
            System.out.print("선택번호 >> ");
            int num = sc.nextInt(); // 무한루프인 경우 종료시점 반드시 명시

            if (num == 3) {
                System.out.println("종료합니다!");
                break;
            }
            switch (num) {
                case 0:
                    tv[0]++;
                    System.out.println("아이유 선택");
                    break;
                case 1:
                    tv[1]++;
                    System.out.println("유재석 선택!");
                    break;
                case 2:
                    tv[2]++;
                    System.out.println("방탄 선택!");
                    break;
                default:
                    System.out.println("잘못 입력했습니다!");
                    break;
            }
        }
        System.out.println(name[0] + " : " + tv[0]);
        System.out.println(name[1] + " : " + tv[1]);
        System.out.println(name[2] + " : " + tv[2]);


        sc.close();
    }
}
