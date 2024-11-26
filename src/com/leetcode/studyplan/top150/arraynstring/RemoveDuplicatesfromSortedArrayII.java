package com.leetcode.studyplan.top150.arraynstring;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//import java.util.ArrayList;
//import java.util.List;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/?envType=study-plan-v2&envId=top-interview-150
public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer,Integer> countMap = new HashMap<>();
        for (Integer num : nums) {
            if (countMap.getOrDefault(num, 0) != 2){
                countMap.put(num, (countMap.getOrDefault(num, 0) + 1));
            }
        }
        int k = 0;
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            int key = entry.getKey();   // 키 가져오기
            int value = entry.getValue(); // 값 가져오기
            k += value;
            for (int i = k-value ; i < k ; i ++){
                nums[i] = key;
            }
        }
        System.out.println(countMap);
        System.out.println(Arrays.toString(nums));
        return k;
    }


/*
        아래 코드는 nums 를 재할당 하고 있기 떄문에, 테스트케이스 실패를 유발함.
        재할당하게 되면, 클래스 외부에서 선언된 객체 nums 와 연결이 끊어짐 - 이를 테스트케이스가 잡아냄

        HashMap<Integer,Integer> countMap = new HashMap<>();
        List<Integer> numsNew = new ArrayList<>();
        for (Integer num : nums) {
            countMap.put(num, (countMap.getOrDefault(num, 0) + 1));
            if (countMap.getOrDefault(num, 0) <= 2) {
                numsNew.add(num);
                continue;
            }
        }
        nums = numsNew.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Output nums : "+Arrays.toString(nums));
        int k = nums.length;
        return k;
*/


    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArrayII removeDup = new RemoveDuplicatesfromSortedArrayII();

        HashMap<String, Object> testCase = new HashMap<>();
        testCase.put("numsArrayList", new int[][]{{-3,-1,0,0,0,3,3},{0,0,1,1,1,1,2,3,3}});
        testCase.put("kArrayList", new int[]{5,7});

        int cntTestCase = ((int[][]) testCase.get("numsArrayList")).length;
        for(int i=0;i<cntTestCase;i++){
            int[] nums = ((int[][]) testCase.get("numsArrayList"))[i];

            // 병합 메서드 실행
            System.out.printf("##########%n[TestCase %d]%nInput nums : %s%nk = %d%n"
                    ,i+1
                    , Arrays.toString(nums)
                    , removeDup.removeDuplicates(nums)
            );


        }
    }

}
