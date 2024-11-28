package com.leetcode.studyplan.top150.arraynstring;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/majority-element/description/?envType=study-plan-v2&envId=top-interview-150
public class MajorityElement {

    public static void main(String[] args){
        MajorityElement major = new MajorityElement();
        int[] testCase1 = {3,2,3};
        System.out.println("testCase1 res : " + major.majorityElement(testCase1));
        int[] testCase2 = {2,2,1,1,1,2,2};
        System.out.println("testCase2 res : " + major.majorityElement(testCase2));

    }
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int res = 0;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : nums){
            countMap.put(num, countMap.getOrDefault(num,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()){
            if(entry.getValue() > n/2){
                res = entry.getKey();
                break;
            }
        }
        return res;
    }
}
