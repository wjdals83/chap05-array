package com.ohgiraffers.section01.array_practice;

public class Array_lotto {

    public static void main(String[] args) {

        // 문제. arr를 활용하여 6자리 로또 당첨 번호를 추첨받아 보자.
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int randomNumberIndex = (int) (Math.random() * arr1.length);     // 인덱스 값 0자리 ~ 9자리 랜덤 출력

        for(int i = 0; i < arr1.length; i++) {

            System.out.println((i+1) + "번 째 숫자는 : " + arr1[randomNumberIndex]);

        }


    }

}
