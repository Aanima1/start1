package org.example.day5.array2;

public class 스트링기본 {
    public static void main(String[] args) {
        String s = "나는! 프로그래머야"; //index를 가지고 있음. 나는 0번
        String s2 = "진짜!!!";

        System.out.println(s + s2);
        String sum = s.concat(s2);
        System.out.println(sum);

        char c = s.charAt(0);       //s스트링에 들어있는 것중 0번 index에 있는 char 속출
        System.out.println(c);

        char c1 = s.charAt(2);
        System.out.println(c1);

        System.out.println(s.endsWith("!")); // 마지막에 "!"가 있느냐 결과는 논리형
        System.out.println(s2.endsWith("!"));
        System.out.println(s.contains("!")); // "!"를 포함하고 있느냐
        System.out.println(s2.contains("!"));

        System.out.println(s.substring(4));
        System.out.println(s.substring(4, 9)); // 8번 위치까지 가져올려면 범위 집어 넣을 거 +1 => 9
        //index
        System.out.println(s2.indexOf("!")); // 중복될 시 첫번째 위치!
        String s3 = "wndlfwndlf10@naver.com";
        //wndlfwndlf10만 추출해주세요
        //1-1. @의 위치를 찾는다.
        //1-2. 앞에서부터 @ 앞까지 추출

        int index = s3.lastIndexOf("@"); //@가 있는 위치
        System.out.println(s3.substring(0, index)); //@ 앞까지 가져옴
        System.out.println(s3.startsWith("wndlf"));

        //s3에 들어있는 것을 대문자로
        System.out.println(s3.toUpperCase());

        //s3에 들어있는 것 중 com을 net을 변경
        System.out.println(s3.replace("com", "net"));  //s3을 바꾼 것이 아니라 ram에 있는 s3를 잠깐 꺼내서 바꾸고 전달. ram에 있는 값은 안바뀜
        System.out.println(s3);     //String은 비파괴로 많이 씀.
        //replace()는 램에 있는 데이터를 가져가자 cpu가 변경
        s3 = s3.replace("com", "net"); //원본에 다시 저장
        //ram은 변경되지 않았음.
        //수동으로 ram에 넣어주어야 한다.

        //s3의 전체 글자수 프린트
        System.out.println(s3.length());
        //길이, 크기, 사이즈, 랭스, 개수

        String s4 = " root";
        System.out.println(s4.replace(" ", ""));
        String s5 = "감자,고구마,양파";
        String s6 = "ABC";
        String s44 = s4.trim();
        System.out.println(s44.length());
        System.out.println(s44.equals("root")); // String끼리 비교해주는 명령어, ==는 기본형끼리 가능
        System.out.println(s4.equals("root")); // String끼리 비교해주는 명령어, ==는 기본형끼리 가능


        //String을 분리해서 배열에 넣어주기!
        String[] datas = s5.split(","); // {"감자","고구마","양파"}
        for (String data : datas) {
            System.out.println(data);
        }

        char[] datas2 = s6.toCharArray(); //{'a', 'b', 'c'}
        for(char data2 : datas2){
            System.out.println(data2);
        }

    }
}
