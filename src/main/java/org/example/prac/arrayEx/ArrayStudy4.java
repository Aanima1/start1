package org.example.prac.arrayEx;

import java.util.Scanner;

public class ArrayStudy4 {
    public static void main(String[] args) {
        /*
        4. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
        (단, 다음에서 입력한 답이 1이면 열차, 2이면 배, 3이면 비행기를 타고 감.)
        가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력 >> 1
        결과 출력은 당신이 가고 싶은 곳인 백두산은 열차를 타고 가야합니다.
       */
        Scanner sc = new Scanner(System.in);
        System.out.print("가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산)"+"\n"+"입력 >> ");
        int want = sc.nextInt();

        int[] choice = new int[3];
        for (int i = 0; i < choice.length; i++) {
            choice[i] = sc.nextInt();

        }


        switch (want){
            case 1:
                System.out.println("당신이 가고 싶은 곳인 백두산은 열차를 타고 가야합니다.");
                break;
            case 2:
                System.out.println("당신이 가고 싶은 곳인 한라산은 배를 타고 가야합니다.");
                break;
            case 3:
                System.out.println("당신이 가고 싶은 곳인 후지산은 비행기를 타고 가야합니다.");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }



        sc.close();
    }
}
