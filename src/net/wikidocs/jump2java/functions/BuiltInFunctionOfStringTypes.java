package net.wikidocs.jump2java.functions;

public class BuiltInFunctionOfStringTypes {
    public static void main(String[] args){
        String a = "hello";
        String b = "java";
        String c = "hello";
        String d = new String("hello");
        //equals
        System.out.printf("%n### functions : .equals ###%n");
        System.out.printf("a.equals(b) : %s%n",a.equals(b));
        System.out.printf("a.equals(c) : %s%n",a.equals(c));
        System.out.printf("a == c : %s%n",a==c);
        System.out.printf("a.equals(d) : %s%n",a.equals(d));
        System.out.printf("a == d : %s%n",a==d);
        /*
        문자열 a와 d는 모두 hello로 값이 같지만 equals를 호출하면 true를, == 연산자를 사용하면 false를 리턴한다.
        a와 b는 값은 같지만 서로 다른 객체이기 때문이다.
        ==은 2개의 자료형이 같은 객체인지를 판별할 때 사용하는 연산자이므로 false를 리턴한다.
         */

        //indexOf
        System.out.printf("%n### functions : .indexOf ###%n");
        System.out.printf("a.indexOf(\"ello\") : %s%n",a.indexOf("ello"));

        //contains
        System.out.printf("%n### functions : .contains ###%n");
        System.out.printf("a.contanis(\"llo\") : %s%n",a.contains("llo"));

        //charAt
        System.out.printf("%n### functions : .charAt ###%n");
        System.out.printf("a.charAt(3) : %s%n",a.charAt(3));
        //substring
        System.out.printf("%n### functions : .substring ###%n");
        System.out.printf("a.substring(1,3) : %s%n",a.substring(1,3));

        //toUpperCase
        System.out.printf("%n### functions : .toUpperCase ###%n");
        System.out.printf("a.toUpperCase() : %s%n",a.toUpperCase());

        //split
        System.out.printf("%n### functions : .split ###%n");
        String test = "a-b-c-d";
        String[] result = test.split("-");
        for (int i=0; i < result.length ; i++) {
            System.out.printf("result[%d] : %s%n",i,result[i]);
        }

        //formatting
        System.out.printf("%n### functions : .format ###%n");
        System.out.println(String.format("%10s",a)); // 좌측 5칸 공백
        System.out.println(String.format("%-10s",a)); // 우측 5칸 공백
        System.out.println(String.format("%-10sJeongmo",a));
        System.out.println(String.format("%.4f", 3.42134234));  // 소수점 자르기
        System.out.println(String.format("%10.4f", 3.42134234));  // '    3.4213' 출력(10자리중 6자리 채우고 좌측 4자리 공백)

    }
}
