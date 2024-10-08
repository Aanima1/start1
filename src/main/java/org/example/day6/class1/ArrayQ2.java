package org.example.day6.class1;

import java.util.Scanner;

public class ArrayQ2 {
    public static void main(String[] args) {
        String[] menu = {"샌드위치", "바게트", "케이크"};
        int[] price = {2000, 3000, 5000};
        int[] sum = new int[menu.length];

        int selectMenu = 0;
        int priceSum = 0;

        Scanner sc = new Scanner(System.in);
        boolean flag = true;


        while(flag){

            System.out.println("주문할 상품을 선택하세요. (1: 샌드위치, 2 : 바게트,  3 : 케이크, 0 : 주문 종료) : ");
            selectMenu = sc.nextInt();

            if (selectMenu < 0 || selectMenu > menu.length) {
                continue;
            }else if(selectMenu == 0){
                for (int i = 0; i < menu.length; i++) {
                    priceSum = price[i] * sum[i];
                }
                System.out.println("총 계산 가격 : " + priceSum);
                flag = false;
            }else{
                System.out.println("주문할 수량을 입력하시오 : ");
                sum[selectMenu - 1] += sc.nextInt();

                System.out.println("현재 주문 상황 : ");
                for (int i = 0; i < menu.length; i++) {
                    System.out.println(menu[i] + " : " + sum[i]);
                }
            }
        }

        sc.close();
    }
}
