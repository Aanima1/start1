package org.example.day3.repeat;

import java.util.Random;

public class For1 {
    public static void main(String[] args) {
        //3번 환영합니다. 출력
        for(int i=0; i<3; i++)
        {
            System.out.println("환영합니다");
        } //for

        for(int j=100; j<=200; j++)
        {
            System.out.println(j);
        } //for

        Random random = new Random();

        for (int k =0; k<5; k++)
        {
            int r = random.nextInt(100)+1;
            System.out.println(r);
        } //for
    }
}
