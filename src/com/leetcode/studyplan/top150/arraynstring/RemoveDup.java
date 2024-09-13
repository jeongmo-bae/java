package com.leetcode.studyplan.top150.arraynstring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

// 26. Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDup {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for (Integer i : nums){
            countMap.put(i,countMap.getOrDefault(i,0)+1);
        }
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(countMap);  // TreeMap 은 Key값 자동 정렬 함
        for (int key : sortedMap.keySet()){
            nums[k] = key ;
            k++;
        }
//        Arrays.sort(nums,Comparator.comparingInt(Integer k,Comparator.reverseOrder()));
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
        return k ;
    }
    public static void main(String[] args) {
        RemoveDup removeDup = new RemoveDup();

        HashMap<String, int[][]> testCase = new HashMap<>();
        testCase.put("numsArrayList", new int[][]{{1,1,2},{0,0,1,1,1,2,2,3,3,4},{-3,-1,0,0,0,3,3}});
        for(int i=0;i<3;i++){
            int[] nums = ((int[][]) testCase.get("numsArrayList"))[i];

            // 병합 메서드 실행
            System.out.printf("##########%n[TestCase %d]%nnums : %s%n"
                    ,i+1
                    , Arrays.toString(nums)
            );
            removeDup.removeDuplicates(nums);

        }
    }
}
