package com.ohgiraffers.section02.copy;

public class Application02 {

    public static void main(String[] args) {

        /* 수업목표. 얕은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다. */

        /* 필기.
        *   얕은 복사의 활용
        *   얕은 복사를 활용하는 것은 주로 메소드 호출 시 인자로 사용하는 경우와
        *   리턴값으로 동일한 배열을 리턴 해주고 싶은 경우 사용한다.
        * */

        String[] names = {"조평훈", "이순신", "홍길동"};     // names 라는 참조변수 생성

        /* 필기. 얕은 복사 확인을 위한 hashcode 출력 */
        System.out.println("names의 hashcode : " + names.hashCode());

        /* 목차. 1. 인자와 매개변수로 활용 */
        print(names);           // 전달인자로 배열 보내줌. static 메소드라 바로 호출 가능.

        /* 목차. 2. 리턴값으로 활용 */
        String[] animals = getAnimals();        // 리턴한 animals 값이 get- 여기에 들어감

        System.out.println("리턴 받은 animals의 hashCode : " + animals.hashCode());      // 얘는 getAnaimals 메소드에서 받은 거고

        print(animals);                                                                // 얘는 print 메소드로 보내준 것.

    }

    public static void print(String[] sarr) {       // 'sarr' 이라는 전달 받을 매개변수를 만든 것. 출력용 print 메소드를 만들었음. 전달 받은 배열의 hashcode 출력, 값 출력 메소드 print.

        // 필기. 전달 받은 배열의 hashcode 출력
        System.out.println("sarr의 hashCode : " + sarr.hashCode() );

        // 필기. 전달 받은 배열의 값 출력
        for(int i = 0; i < sarr.length; i++) {
            System.out.println(sarr[i]);
        }

        System.out.println();

    }

     public static String[] getAnimals() {

        String[] animals = new String[] {"낙타", "호랑이", "나무늘보"};      // 배열 이렇게도 만들 수 있음.

         System.out.println("새로 만든 animals의 hashcode : " + animals.hashCode());

         return animals;        // 호춣란 곳으로 animals 배열을 가지고 떠남.
     }

}
