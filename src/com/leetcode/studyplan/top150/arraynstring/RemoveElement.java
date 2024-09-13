package com.leetcode.studyplan.top150.arraynstring;
// 27. Remove Element
// https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class RemoveElement {
    public int removeElements(int[] nums, int val) {
        int k = nums.length;
        ArrayList<Integer> arrListOfNums = new ArrayList<>();
        for (int num : nums){
            arrListOfNums.add(Integer.valueOf(num)); // Integer.valueOf() 안해도 AutoBoxing 되긴함
        }
//        System.out.println(arrListOfNums);
        while(arrListOfNums.remove(Integer.valueOf(val))) {
            k--;
            //System.out.println(arrListOfNums);
        }

        nums = new int[arrListOfNums.size()];
        for (int i=0;i< arrListOfNums.size(); i++) {
            nums[i] = arrListOfNums.get(i);
        }
        System.out.println(Arrays.toString(nums));

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
