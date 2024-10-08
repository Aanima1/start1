package org.example.day5.review;

import java.util.Random;

public class Exam1 {
    public static void main(String[] args) {
/*

//        1.   int[] term1 = {77, 88, 99, 55, 70};
//        int[] term2 = {99, 100, 88, 80, 70};
//        // 1. 성적이 2학기에 향상된 학생의 수를 카운트해서 프린트
//        // 2. 성적이 1, 2학기 동일한 학생의 수를 카운트해서 프린트

        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};

        // c타입의 for문 : i를 이용가능, 입력/출력 가능, 여러개의 배열을 다룰 때
        // for-each문 : 간단, 출력만 가능, 하나의 배열을 다룰 때\
        // 누적시키는 변수는 반복문 안에 넣으면 X
        int high = 0, same = 0;

        for (int i = 0; i < term1.length; i++) {
            if (term1[i] == term2[i]) { // 조건에 해당하는 구문은 결과가 무조건 논리형(true/false)
                same++;
            } //if
            else if (term1[i] < term2[i]) {
                high++;
            }
        }//for

        System.out.println("성적이 2학기에 향상: " + high);
        System.out.println("성적 동일: " + same);
*/


//        2. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
//        숫자 입력 : 55
//        숫자 입력 : 77
//        숫자 입력 : 11
//                ----------------
//        합계 143
//        평균 47.666666667

    /*
        Scanner sc = new Scanner(System.in);
        int[] data = new int[3]; // {0,0,0}
        for (int i = 0; i < data.length; i++) {
            //출력, 입력
            System.out.print("숫자 입력 : ");
            data[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(data));
        //Arrays.toString(data) => 배열에 있는 데이터를 가져다가 "[값, 값, 값]" String으로 만들어준다

        //합, 평균 2번쨰 패턴
        int sum = 0;
        for (int x : data) {
            sum += x;
        }
        System.out.println(sum);
        System.out.println( sum / (double) data.length); //length는 정적 변수 : int로 정해졌기 때문에 다른 값은 못 바꿈
        // 산술연산시 하나라도 실수이면 결과는 실수이다

        sc.close();
*/

//        3. int[] n = new int[1000];
//        random한 값 1~1000까지 배열에 넣어 전체 출력(씨앗값 : 44)
//        3-1. 첫번째값, 세번째값, 다섯번째값, 100번째값, 990번째 값을 더한 결과값 출력
//        3-2. 전체 합계와 평균 출력

        /*
        int[] n = new int[1000];
        Random r = new Random(44);
        int sum2 = 0;
        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(1000) + 1;
            sum2 = sum2 + n[i];
        }
        System.out.println(Arrays.toString(n));
        System.out.println(n[0] + n[2] + n[4] + n[99] + n[989]);
        System.out.println(sum2);
        System.out.println((double) sum2 / n.length);
        */

//        4. 다음과 같이 값을 입력받아 출력되도록 프로그래밍하시오.
//        (단, 다음에서 입력한 답이 1이면 열차, 2이면 배, 3이면 비행기를 타고 감.)
//        가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력 >> 1
//        결과 출력은 당신이 가고 싶은 곳인 백두산은 열차를 타고 가야합니다.

/*
        Scanner sc = new Scanner(System.in);
        System.out.print("가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력 >>");
        // 입력 -> 처리(저장) -> 출력
        int input = sc.nextInt(); // 1,2,3
        String result = null; //주소가 없다. 참조형
        
        switch (input){
            case 1: result = "백두산은 열차"; break;
            case 2: result = "한라산은 배"; break;
            case 3: result = "후지산은 비행기"; break;
            default: result = "안탐";
        }

        System.out.println("당신이 가고 싶은 곳인 "+ result +"를 타고 가야합니다.");
        
        sc.close();
    */

//        5. random한 값 1부터 100까지 배열에 넣어 전체 출력(씨앗값 : 555), length는 1000
//        80이상인 개수, 70~79인 수 개수, 50~69인 수 개수, 49보다 작은 수 개수 카운트하여 출력
        // legth == 길이 == 개수 == size

        Random r = new Random(555);
        int[] n = new int[1000];
        int c80 = 0, c70 = 0, c50 = 0, c0 = 0;

        for (int i = 0; i < n.length; i++) {
            n[i] = r.nextInt(100) + 1;
            if (n[i] >= 80) {
                c80++;
            } else if (n[i] >= 70) { //70~79
                c70++;
            } else if (n[i] >= 50) { //50~59
                c50++;
            } else {
                c0++;
            }
        }
        System.out.println(c80 + " " + c70 + " " + c50 + " " + c0);


    }
}
