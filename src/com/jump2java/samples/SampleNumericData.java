package com.jump2java.samples;

public class SampleNumericData {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        System.out.println(String.format("+ res : %d",num1+num2));
        System.out.println(String.format("- res : %d",num1-num2));
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(7 % 3);  // 1 출력
        System.out.println(3 % 7);  // 3 출력
        num1++;
        num2--;
        System.out.print(String.format("num1++ = %d , num2-- = %d",num1,num2));
    }
}
