package com.ohgiraffers.section01.array_practice;

public class Array_practice01 {

    public static void main(String[] args) {

        // 문제. arr배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
        int[] arr = {10, 20, 30, 50, 3, 60, -3};
        //arr[i] 가 값일 것.
        for(int i = 0; i < arr.length; i++) {

            if(i == 3) {

                continue;
            }

            System.out.println("arr[" + i + "] = " + arr[i]);

        }


    }

}
