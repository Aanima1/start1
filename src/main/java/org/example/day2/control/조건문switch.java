package org.example.day2.control;

public class 조건문switch {
    public static void main(String[] args) {
        int day = 5;  //일~토 : 1~7
        //주말인지 판단하고 싶음
        switch(day){ // 실수 X, longX, char, String
            case 1: case 6:
                System.out.println("주말");
                break;
            case 2: case 3: case 4: case 5:
                System.out.println("평일");
                break;

        }


    }
}
