package net.wikidocs.jump2java.dtypes;

public class BooleanTypes {
    public static void main(String[] args){
        boolean isSuccess = true;
        boolean isTest = false;
        if (isTest){
            System.out.printf("이건 프린트 안될거고%n%n");
        } else System.out.printf("isTest 가 false 니까 이게 프린트 돼야함%n%n");
        // isSuccess 가 true 일 때, 쭉쭉 진행해보자
        if (isSuccess){
            System.out.printf("키 비교 시작%n");
            int average = 180;
            int height = 185;
            boolean isTall = height > average;
            if (isTall) {
                System.out.println("평균보다 키가 크다");
            }else System.out.println("평균보다 키가 작다");
        } else System.out.println("isSuccess 가 false 입니다");

        int i = 3;
        boolean isOdd = i % 2 == 1;
        System.out.printf("%nisOdd : %b",isOdd);  // true 출력

    }
}
/*
 | 데이터 유형                   | 포맷 지정자     | 설명                             |
 |----------------------------|--------------|----------------------------------|
 | 정수 (int, long)            | %d           | 10진수 정수                      |
 | 문자 (char)                 | %c           | 단일 문자                        |
 | 문자열 (String)              | %s           | 문자열                          |
 | 불린 (boolean)              | %b           | true 또는 false 출력             |
 | 줄바꿈                       | %n           | 플랫폼에 맞는 줄바꿈 문자         |
 | % 문자                      | %%           | % 문자 자체                      |
 | 부동소수점 (float, double)    | %f           | 고정 소수점 표기법               |
 | 정수 (int, long)            | %o           | 8진수 정수                       |
 | 정수 (int, long)            | %x / %X      | 16진수 정수 (소문자/대문자)      |
 | 부동소수점 (float, double)    | %e / %E      | 지수 표기법 (소문자/대문자)      |
 | 부동소수점 (float, double)    | %g           | 간략한 부동소수점 표기법         |
 */