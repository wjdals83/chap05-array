package com.ohgiraffers.section01.array;

public class Application03 {

    public static void main(String[] args) {

        /* 수업목표. 배열을 사용하는 예시를 이해하고 적용해보자 */
        /* 필기. 랜덤한 카드를 한 장 뽑아서 출력해보자 */

        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};      //배열은 0,1,2,3''''
        String[] cardNumber = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};

        int randomShapeIndex = (int)(Math.random() * shapes.length);        // 이러면 shapes에서 0,1,2,3이 출력될 것
        int randomCardNumberIndex = (int)(Math.random() * cardNumber.length);

        System.out.println("당신이 뽑은 카드는 ? : " + shapes[randomShapeIndex] + " " + cardNumber[randomCardNumberIndex]);

    }

}
