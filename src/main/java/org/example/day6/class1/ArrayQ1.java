package org.example.day6.class1;

import java.util.Scanner;

public class ArrayQ1 {
    public static void main(String[] args) {
//        Jsoup.connect("https://serieson.naver.com/v3/movie/ranking/realtime");

        String[] movie = {"사랑과 전쟁", "인사이드 아웃", "데드풀", "콰이어트 플레이스", "너의 이름은"};
        int[] view = {150000, 230000, 180000, 210000, 190000};
        int select = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("네이버 시리즈");
        for (int i = 0; i < movie.length; i++) {
            System.out.println(i + 1 + ". " + movie[i] + "-" + "조회수 : " + view[i]);
        }

//        boolean flag = true;

        while(true){
            System.out.println("정보를 확인하고 싶은 영화 번호를 선택하세요 (1-5)");
            System.out.println();
            select = sc.nextInt();
            if(select<5 && 0<select){
//                flag = false;
                break;
            }
        }
        System.out.println("선택한 영화 : " + movie[select-1] );
        System.out.println("조회수 : " + view[select-1] );
        sc.close();

    }
}
