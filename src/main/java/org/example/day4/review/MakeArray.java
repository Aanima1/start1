package org.example.day4.review;

public class MakeArray {
    public static void main(String[] args) {
        // 배열을 생성할 때
        // 1. 처음부터 값을 알고 있는 경우
        int[] days = {1, 3, 4, 5, 6};

        // 2. 처음에는 모르고 있는 경우
        String[] doing = new String[5]; //{null, null, ...} 널로 초기화 상태
        doing[0] = "쉬기"; //String --> "", char --> ''
        doing[1] = "서울숲";
        System.out.println(days);
        System.out.println(doing);

        double[] temp = {22, 20, 15, 17, 19};

        for (int i = 0; i < temp.length; i++) {
            System.out.println(days[i] + " " + doing[i] + " " + temp[i]);
        }
        
        //for-each문 > 간단하지만 꺼내오는 용도로만 사용가능
        for(double t : temp){
            //temp라는 배열을 앞에서부터 순서대로 있는지 체크해서 하나씩 꺼내어 t라는 변수에 넣어주는 for문 (for-each문)
            System.out.println(t);
        }

//        System.out.println(days[0] + " " + doing[0] + " " + temp[0]);
//        System.out.println(days[1] + " " + doing[1] + " " + temp[1]);

    }

}
