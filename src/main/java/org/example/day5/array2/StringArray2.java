package org.example.day5.array2;

import java.util.Arrays;

public class StringArray2 {
    public static void main(String[] args) {
        String all = "국어, 영어, 수학, 컴퓨터";
        //1. String[]으로 바꾸어보세요.
        String[] sub = all.split(", ");
        int count = 0;


        //2. 바꾸었더니 공백이 포함되어 있다면, 공백을 모두 제거 후 다시 배열에 넣으세요
        for (int i = 0; i <sub.length; i++) {
//            sub[i] = sub[i].replace(" ", "");
            sub[i] = sub[i].trim();
            if(sub[i].length() < 3){
                count++;
            }
        }
        System.out.println(Arrays.toString(sub));
        //3. 과목수는?
        System.out.println(sub.length);

        //4. 컴퓨터의 위치는?

        for (int i = 0; i < sub.length; i++) {
            if(sub[i].equals("컴퓨터")) {
                System.out.println(i+1);
            }
        }
        //5. 과목명이 3글자 미만인 과목수는?

        System.out.println("과목명이 3글자 미만: "+count);



    }
}
