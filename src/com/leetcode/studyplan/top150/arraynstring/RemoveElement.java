package com.leetcode.studyplan.top150.arraynstring;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class RemoveElement {
    public int removeElements(int[] nums, int val) {
        int k = 0;
        ArrayList<Integer> arrListOfNums = new ArrayList<>();
        for (int num : nums){
            arrListOfNums.add((Integer) num);
        }
        System.out.println(arrListOfNums);
        return k;
    }
    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement(); // static 메서드가 아니니까(인스턴스 메서드) 객체화 해야함
        HashMap<String, Object> testCase = new HashMap<>();
        testCase.put("numsArrayList", new int[][]{{3,2,2,3},{0,1,2,2,3,0,4,2}});
        testCase.put("valArrayList",new int[]{3,2});
        for(int i=0;i<2;i++){
            int[] nums = ((int[][]) testCase.get("numsArrayList"))[i];
            int val = ((int[]) testCase.get("valArrayList"))[i];

            // 병합 메서드 실행
            System.out.printf("##########%n[TestCase %d]%nnums : %s%nval : %d%n"
                    ,i+1
                    ,Arrays.toString(nums)
                    ,val
            );
            removeElement.removeElements(nums, val);

        }
    }
}
