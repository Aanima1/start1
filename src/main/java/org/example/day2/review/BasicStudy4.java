package org.example.day2.review;

import java.util.Scanner;

public class BasicStudy4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("여행 지역을 입력하세요 : ");
        String trip = sc.nextLine();
        System.out.println("1인당 경비를 입력하세요 : ");
        double money = sc.nextDouble();
        System.out.println("여행 인원을 입력하세요 : ");
        int people = sc.nextInt();
        System.out.println("할인율(%)을 입력하세요 : ");
        double sale = sc.nextDouble();
        System.out.println("VIP 여부 (true/false)를 입력하세요 : ");
        boolean vip = sc.nextBoolean();
        System.out.println("당부의 말을 입력하세요 : ");
        sc.nextLine();
        String talk = sc.nextLine();


        System.out.println("===== 여행 경비 계산 결과 =====\n");
        System.out.println("여행 지역 : " + trip + "\n" + "1인당 경비 : " + money + "\n" + "여행 인원 : " + people + "\n" + "기본 할인율(%) :  " + sale);
        if(vip){
            sale = sale +5;
        }
        double allMoney = money * people;
        double saleMoney = allMoney * sale * 0.01;
        double realMoney = allMoney - saleMoney;

        System.out.println("VIP 추가 할인율 : 5%" + "\n"+"최종 할인율: "+sale + "\n" + "총 경비 : " +allMoney+ "\n"+ "할인 금액 :  "+saleMoney+ "\n"+ "할인 후 총 경비 : "+ realMoney + "\n"+ "당부의 말 : " + talk);

    }
}