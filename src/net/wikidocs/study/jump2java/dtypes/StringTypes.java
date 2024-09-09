package net.wikidocs.study.jump2java.dtypes;

public class StringTypes {
    public static void main(String[] args){
        char a1 = 'a';  // 문자로 표현
        char a2 = 97;  // 아스키코드로 표현
        char a3 = '\u0061';  // 유니코드로 표현
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.printf("%n");
        String a = "Happy Java";  // String a = new String("Happy Java");
        String b = "a";     // String b = new String("a");
        String c = "123";   // String c = new String("123");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.printf("%n");
        /*
        String a = "Happy Java" 와 String b = new String("Happy Java")에서
        a, b 변수는 같은 문자열 값을 갖게 되지만 완전히 동일하지는 않다.
        첫 번째 코드는 리터럴(literal) 표기 방식이라고 하는데 고정된 값을 그대로 대입하는 방법을 말한다.
        이와 달리 두 번째 방식은 항상 새로운 String 객체를 만든다.
        첫 번째 방식은 동일한 리터럴을 사용할 경우 새로운 String 객체를 만들지 않고 기존에 만든 것을 재활용한다.

        [Wrapper 클래스]
        int, long, double, float, boolean, char 등의 원시 자료형에는 각각 그에 대응하는 Wrapper 클래스가 있다.
        원시 자료형	Wrapper 클래스
        int	    Integer
        long	Long
        double	Double
        float	Float
        boolean	Boolean
        char	Character
        멀티 스레드 환경에서 동기화를 지원하려면 원시 자료형대신 Wrapper 클래스를 사용해야 한다.
        */

    }
}
