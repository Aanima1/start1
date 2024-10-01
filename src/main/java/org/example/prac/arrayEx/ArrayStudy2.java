package org.example.prac.arrayEx;

import java.util.Scanner;

public class ArrayStudy2 {
    public static void main(String[] args) {
        /*
        2. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
        숫자 입력 : 55
        숫자 입력 : 77
        숫자 입력 : 11
                ----------------
        합계 143
        평균 47.666666667
        */
        Scanner sc = new Scanner(System.in);
        int[] n = new int[3];
        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            System.out.print("숫자 입력 : ");
            n[i] = sc.nextInt();
            sum = sum + n[i];
        }
        float avr = (float) sum / n.length;
//        BigDecimal avrRounded = new BigDecimal(avr).setScale(9, RoundingMode.HALF_UP);

        System.out.println("\t"+"\t"+"------------");
        System.out.println("합계 "+sum);
        System.out.println("평균 "+avr);


        sc.close();
    }
}
