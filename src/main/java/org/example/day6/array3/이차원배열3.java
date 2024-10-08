package org.example.day6.array3;

import javax.swing.*;

public class 이차원배열3 {
    public static void main(String[] args) {
        // 전체 프레임이 필요
        // new를 이용해서 부품을 만들어 램에 넣어둠.
        JFrame f = new JFrame("이차원 테이블");
        //1. new JFrame(): JFrame을 램에 넣어둔다.
        //2. f = new JFrame(): 램에 넣어둔 주소를 변수에 저장
        //3. JFrame f: f라는 변수에는 JFrame이 들어있는 주소를 넣어두었다를 표시
        //   --> 이렇게 쓰면 f에는 JFrame이 저장된 위치만 넣을 수 있고,
        //       다른 부품의 위치는 넣을 수 없음.

        System.out.println(f);
        f.setSize(500, 500);
        String[] title = {"장소", "누구와", "언제"};
        String[][] contents = {
                {"부산", "동생", "오전출발"},
                {"대전", "형", "저녁출발"},
                {"제주도", "부모님", "오후출발"}
        };

        JTable table = new JTable(contents, title); //(2차원 배열 데이터, 1차원의 항목명)
        JScrollPane scroll = new JScrollPane(table);

        f.add(scroll);

        // 맨 끝에!!
        f.setVisible(true); //보이는 것 설정

    }
}
