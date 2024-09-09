package net.wikidocs.jump2java.dtypes;

public class SampleNumericData {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        System.out.printf("+ res : %d%n",num1+num2);
        System.out.printf("- res : %d%n",num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println(7 % 3);  // 1 출력
        System.out.println(3 % 7);  // 3 출력
        num1++;
        num2--;
        System.out.printf("num1++ = %d , num2-- = %d%n",num1,num2);
        System.out.println("===== num1++ 연산 순서 체크 =====");
        num1 = 0;
        System.out.println(num1++);
        System.out.println(num1);
        System.out.println("===== ++num1 연산 순서 체크 =====");
        num1 = 0;
        System.out.println(++num1);
        System.out.println(num1);

    }
}
