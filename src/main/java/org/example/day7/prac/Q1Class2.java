package org.example.day7.prac;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1Class2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String id = "root";
        int pw = 1234;
        String title = null;
        String content = null;
        int date = 0;

        while (true) {
            System.out.println("ID를 입력하세요:");
            String id2 = sc.next();

            System.out.println("비밀번호를 입력하세요:");
            int pw2 = sc.nextInt();

            if (id2 == id || pw2 == pw) {
                System.out.println("일기 작성을 시작합니다.");
                break;
            } else {
                System.out.println("입력 오류!! 다시 입력하세요.");
            }
        }


        while (true) {
            System.out.println("날짜를 입력하세요 (예: 20241008)");
            date = sc.nextInt();
            System.out.println("제목을 입력하세요:");
            title = sc.next();
            System.out.println("내용을 입력하세요:");
            content = sc.next();


            if (title.length() == 0 || content.length() == 0) {
                System.out.println("내용을 다시 입력하시오!");
            } else {
                break;
            }

        }

        try {
            FileWriter file = new FileWriter(title + ".txt");
            file.write(date + "");
            file.write(title + "");
            file.write(content + "");
            System.out.println("파일 저장에 성공하였습니다.");
            file.close();
        } catch (IOException ex) {
            System.out.println("파일 저장 오류!");
        }

        System.out.println("일기가 저장되었습니다: " + title + ".txt");


        sc.close();
    }

}
