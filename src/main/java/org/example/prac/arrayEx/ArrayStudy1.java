package org.example.prac.arrayEx;

public class ArrayStudy1 {
    public static void main(String[] args) {
//        1.   int[] term1 = {77, 88, 99, 55, 70};
//        int[] term2 = {99, 100, 88, 80, 70};
//        // 1. 성적이 2학기에 향상된 학생의 수를 카운트해서 프린트
//        // 2. 성적이 1, 2학기 동일한 학생의 수를 카운트해서 프린트
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};

        int count1 = 0, count2 = 0;

        for (int i = 0; i < term1.length; i++) {
            if(term1[i] < term2[i]){
                count1++;
            }
            if(term1[i] == term2[i]){
                count2++;
            }
        }
        System.out.println("2학기에 향상된 학생의 수 : "+count1);
        System.out.println("성적이 1,2학기 동일한 학생의 수 : "+count2);

    }
}
