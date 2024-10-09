package org.example.prac.var1;

import javax.swing.*;

public class Q3 {
    public static void main(String[] args) {


        JFrame f = new JFrame();
        int mathSum = 0;
        int engSum = 0;

        String math1 = JOptionPane.showInputDialog("첫 번째 수학 점수를 입력하세요 :");
        int realMath1 = Integer.parseInt(math1);

        String math2 = JOptionPane.showInputDialog("두 번째 수학 점수를 입력하세요 :");
        int realMath2 = Integer.parseInt(math2);

        String eng1 = JOptionPane.showInputDialog("첫 번째 영어 점수를 입력하세요 :");
        int realEng1 = Integer.parseInt(eng1);

        String eng2 = JOptionPane.showInputDialog("두 번째 영어 점수를 입력하세요 :");
        int realEng2 = Integer.parseInt(eng2);

        mathSum = realMath1 + realMath2;
        engSum = realEng1 + realEng2;

        JOptionPane.showMessageDialog(f, "수학 평균 점수: " + (mathSum / 2.0) + "\n" + "영어 평균 점수: " + (engSum / 2.0));


//        f.setVisible(true);
    }
}
