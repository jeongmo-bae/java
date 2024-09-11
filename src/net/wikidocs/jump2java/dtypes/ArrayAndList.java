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
                                Comparator.reverseOrder()
                        )
        );
        System.out.println(Arrays.deepToString(testArray));

        // 리스트 - ArrayList
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        pitches.add(0, "133");
        System.out.println(pitches);

    }
}
