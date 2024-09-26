package org.example.day2.control;

public class 조건문if2 {
    public static void main(String[] args) {
        int hour = 16;

        if(hour < 11){
            System.out.println("아직 멀었다.");

        }else if(hour < 14){
            System.out.println("좀 남았다.");

        }else{
            System.out.println("조금 남았다.");
        }
    }
}
