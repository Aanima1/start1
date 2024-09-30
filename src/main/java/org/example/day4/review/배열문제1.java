package org.example.day4.review;

public class 배열문제1 {
    public static void main(String[] args) {
        //3일의 휴가기간동안 매일 다른 곳을 여행가려함
        // 1. 여행가고 싶은 지역 3개를 배열에 넣기 (처음부터 알고 있는 경우)
        String[] location = {"제주도", "울릉도", "송도"};

        // 2. 여행지역마다의 경비(처음부터 알고 있는 경우)
        int[] money = {50000, 40000, 10000};

        // 3. 함께 가고 싶은 사람 이름 (처음에는 모름)
        String[] name = new String[3];

        // 첫번째 여행지만 "친구"로 나중에 결정됨
        name[0] = "친구";
//        name[2] = "동생";

        // 다음과 같이 출력
        // 제주도 50000 친구
        // 울릉도 40000 null
        // 송도   10000 동생


        //int i 변수의 역할 : 반복 횟수 체크, 배열의 인덱스 접근, 계산의 대상 데이터용)
        for (int i = 0; i < name.length; i++) {
            System.out.println(location[i] + "\t" + money[i] + "\t" + name[i]);
        } //for
    }
}
