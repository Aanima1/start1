package org.example.day4.array;

public class ArrayPrac1 {
    public static void main(String[] args) {
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};

        int count1=0, count2=0;

        for (int i = 0; i < term1.length; i++) {

            if(term1[i] < term2[i]){
                count1++;
            }
            if(term1[i] == term2[i]){
                count2++;
            }

        }
        System.out.println(count1);
        System.out.println(count2);


    }
}
