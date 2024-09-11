package net.wikidocs.jump2java.dtypes;

import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
public class ArrayAndList {
    public static void main(String[] args){
        //배열은 자료형 바로 옆에 [] 기호
        int[] odds = {1,3,5,7,9};
        //System.out.println(odds);
        System.out.println(odds[0]);
        odds[1] = 2;
        System.out.printf("odds[1] change 3->2 : %d%n",odds[1]);
        String[] weeks = new String[7]; // 길이 지정해서 배열 선언 가능
        weeks[0] = "월";
        weeks[1] = "화";
        weeks[2] = "수";
        weeks[3] = "목";
        System.out.println(weeks[4]);   //null
        weeks[4] = "금";
        weeks[5] = "토";
        weeks[6] = "일";
        for (int i = 0; i < weeks.length; i++) {
            System.out.println(weeks[i]);
        }
        Arrays.sort(weeks);
        System.out.println(Arrays.toString(weeks));

        int[][] testArray = {{1,2},{1,3},{3,1}};
        Arrays.sort(
                testArray,
                Comparator.comparingInt((int[] arr) -> arr[0])
                        .thenComparing(
                                (int[] arr) -> arr[1],
                                Comparator.reverseOrder()   //Comparator.naturalOrder() - 오름차순
                        )
        );
        System.out.println(Arrays.deepToString(testArray));

        // 리스트 - ArrayList
        ArrayList<String> pitches = new ArrayList<>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(2, "133");
        System.out.println(pitches);
        System.out.println(pitches.get(0));
        System.out.println(pitches.size());
        System.out.println(pitches.contains("142"));
//        System.out.println(pitches.containsAll(new {"138","142"})));
        System.out.println(pitches.remove("129"));   // true 반환
        System.out.println(pitches);
        System.out.println(pitches.remove(0));    // 해당 인덱스 value 반환
        System.out.println(pitches);
        /*
        제네릭스(ArrayList<String>)를 사용하지 않으면 ArrayList에 추가하는 객체는 Object 자료형으로 인식된다.
        Object 자료형은 모든 객체가 상속하고 있는 가장 기본적인 자료형이다.
        따라서 ArrayList 객체인 pitches에 값을 넣을 때는 문제가 없지만 값을 가져올 때는
        매번 Object 자료형에서 String 자료형으로 형 변환(casting) 을 해야 한다.
        EX> String one = (String) pitches.get(0); // Object 자료형을 String 자료형으로 형 변환
        */
        String[] data = {"138", "129", "142"};  // 이미 투구수 데이터 배열이 있다.
        ArrayList<String> pitches2 = new ArrayList<>(Arrays.asList(data));
        System.out.println(pitches2.get(0));
        String result = String.join(",", pitches2);
        System.out.println(result);

    }
}
