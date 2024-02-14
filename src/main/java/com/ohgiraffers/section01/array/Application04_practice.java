package com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Application04_practice {

    public static void main(String[] args) {

        /* 수업목표. 배열을 사용하는 예시를 이해하고 적용해보자 */
        /* 필기.
         *   5명의 자바 점수를 정수로 입력받아 합계와 평균을 실수로 구하는 프로그램 만들기
         * */

        int[] scores = new int[5];      // 배열 변수 5칸짜리 만들었음

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < scores.length; i++) {  //scores[i]의 i 값이 0 ~ 4 총 5번

            System.out.print((i+1) + "번 째 학생의 자바 점수를 입력해주세요 : " );
            scores[i] = sc.nextInt();       // 이러면 i+1 번 째 학생의 점수를 5번 받고 scores[]에 저장할 것

        }

        double sum = 0;
        double avg = 0;

        for (int i = 0; i < scores.length; i++) {

            sum += scores[i];

        }

        avg = sum / scores.length;

        System.out.println();
        System.out.println("5명의 점수 합은 ? : " + sum);
        System.out.println("5명의 평균은 ? : " + avg);

    }

}
