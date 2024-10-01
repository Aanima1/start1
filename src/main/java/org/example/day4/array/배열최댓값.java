package org.example.day4.array;

import java.util.Arrays;
import java.util.Scanner;

public class 배열최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //배열에 여러번 입력한 데이터를 넣어주는 패턴
        int[] save = new int[5];
        for (int i = 0; i < save.length; i++) {
            System.out.print("숫자 입력 >> ");
            save[i] = sc.nextInt(); //모든 입력은 String --> int로 변경하는 기능으로 포함.
            // 입력한 숫자를 String에서 int로 바꾸고, save 배열에 넣어줌
        }
        System.out.println(Arrays.toString(save));

        Arrays.sort(save); // 오름차순 정렬, 맨앞 최솟값-맨뒤 최댓값
        System.out.println("최솟값은 "+ save[0] + ", 최댓값은 "+save[save.length -1]);

        //해당 인덱스까지 최댓값 넣는 변수 필요
        int max = save[0]; // save[0]으로 초기화, 0으로 초기화 하면 마이너스 값이 나올 때 오류나기 때문에 안된다.

        // for문 순회
        // if(max < save[i])이면, max = save[i]
        for (int i = 0; i < save.length; i++) {
            if(max < save[i]){
                max = save[i];
            } //if
        } //for
        System.out.println(max);



        sc.close(); // stream 닫힘. 맨 끝에 위치
    }
}
