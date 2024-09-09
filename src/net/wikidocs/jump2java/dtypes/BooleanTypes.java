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
    }
}
