package org.example.day3.repeat;

public class Pattern2 {
    public static void main(String[] args) {
        //1번. 1부터 499까지 누적해서 프린트
        int sum = 0;
        for (int i = 1; i < 500; i++) {
            sum = sum + i;

        }
        System.out.println(sum);
        //2번. 1부터 100까지 중 4의 배수만 누적해서 프린트
        int sum2 = 0;
        for (int j = 1; j <= 100; j++) {

            if (j % 4 == 0) {
                sum2 = sum2 + j;
            }

        }
        System.out.println(sum2);

        //3번. 500부터 2씩 감소하면서5의 배수는 빼고,
        //     누적해서 프린트.

        int sum3 = 0;
        for (int k = 500; k > 0; k = k - 2) {

            if (k % 5 == 0) {
                continue;
            }
            sum3 = sum3 + k;

        }
        System.out.println(sum3);

    }
}
