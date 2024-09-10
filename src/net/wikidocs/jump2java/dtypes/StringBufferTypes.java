package net.wikidocs.jump2java.dtypes;

// StringBuffer는 문자열을 추가하거나 변경할 때 주로 사용하는 자료형
public class StringBufferTypes {
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();  // StringBuffer 객체 sb 생성
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        System.out.println(sb.toString());
        // StringBuffer 자료형은 append 메서드를 사용하여 문자열을 계속해서 추가해 나갈 수 있다.
        // 그리고 toString() 메서드를 사용하면 StringBuffer를 String 자료형으로 변경할 수도 있다.
        String result = "";
        result += "hello";
        result += " ";
        result += "jump to java";
        System.out.println(result);
        /*
        두 번째 예제와 첫 번째 예제의 결과는 같지만 내부적으로 객체를 생성하고 메모리를 사용하는 과정은 다르다.
        첫 번째 예제에서는 StringBuffer 객체를 한 번만 생성하지만, 두 번째 예제에서는 String 자료형에 + 연산이 있을 때마다
        새로운 String 객체를 생성하므로 총 4개의 String 자료형 객체가 만들어진다.
        String 자료형은 값이 한 번 생성되면 변경할 수가 없다.
        toUpperCase와 같은 메서드를 보면 문자열이 변경되는 것처럼 생각할 수도 있지만 해당 메서드를 수행할 때
        또 다른 String 객체를 생성하여 리턴할 뿐이다. 반면에 StringBuffer 자료형은 값을 변경할 수 있으므로 생성된 값을 언제든지 수정할 수 있다.
        StringBuffer - mutable
        String - immutable (insert 메서드가 없지)

        StringBuffer는 스레드 안전하며, 멀티스레딩 환경에서 안전하게 사용할 수 있음
		StringBuilder는 스레드 안전하지 않지만, 단일 스레드 환경에서 더 빠르게 작동
         */
        System.out.println(sb.insert(5, "!!!"));
        System.out.println(sb); // insert 한게 유지됨
        System.out.println(sb.getClass().getName()); //StringBuffer
        System.out.println(sb.toString().getClass().getName());  // String
        // substring 은 똑같음



    }
}
