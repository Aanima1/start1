package org.example.day3.order;

import java.util.Date;

public class Date1 {
    public static void main(String[] args) {
        //입력할 때 자동으로 년월일, 시분초 구해주고 싶다
        Date date = new Date();
        int year = date.getYear() + 1900;
        int month = date.getMonth() + 1;
        int date1 = date.getDate();
        int day = date.getDay();
        int hour = date.getHours();
        int minute = date.getMinutes();
        int second = date.getSeconds();

        System.out.println(year + " " + month + " " + date1 + " " + day + "  " + hour + " " + minute + " " + second);
        System.out.println(year + " ");

        // 오늘 무슨 요일인가 프린트

        switch(day){
            case 0:
                System.out.println("오늘은 일요일 입니다.");
                break;
            case 1:
                System.out.println("오늘은 월요일 입니다.");
                break;
            case 2:
                System.out.println("오늘은 화요일 입니다.");
                break;
            case 3:
                System.out.println("오늘은 수요일 입니다.");
                break;
            case 4:
                System.out.println("오늘은 목요일 입니다.");
                break;
            case 5:
                System.out.println("오늘은 금요일 입니다.");
                break;
            case 6:
                System.out.println("오늘은 토요일 입니다.");
                break;
            default:
                System.out.println("다시 입력!");
                break;
        }
    }
}
