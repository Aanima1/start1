package org.example.day2.control;

public class 조건문switch3 {
    public static void main(String[] args) {
            String food = "감자탕";

            switch (food){
                case "짬뽕":
                    System.out.println("중국집으로~");
                    break;
                case "우동":
                    System.out.println("분식집으로~");
                    break;
                case "감자탕":
                    System.out.println("한식집으로~");
                    break;
                default:
                    System.out.println("집에서 먹자");
//                    break;
            }


    }
}
