package org.example.day5.array2;

public class StringArray1 {
    public static void main(String[] args) {
        String tel = " 011-245-1234 ";
        tel = tel.trim();

        String[] phNum = tel.split("-");

        switch(phNum[0]){
            case "011":
                System.out.println("SK"); break;
            case "019":
                System.out.println("LG"); break;
            default:
                System.out.println("Apple"); break;
        }
        
        if(phNum[0].equals("011")){
            System.out.println("SK");
        }else if(phNum[0].equals("019")){
            System.out.println("LG");
        }else{
            System.out.println("Apple");
        }

        if(phNum[1].length() > 3){
            System.out.println("최신폰");
        }else{
            System.out.println("오래된 폰");
        }

        int sum = phNum[0].length() + phNum[1].length() + phNum[2].length();
        if (sum >= 10){
            System.out.println("유효한 번호");
        }else{
            System.out.println("유효하지 않은 번호");
        }



    }
}
