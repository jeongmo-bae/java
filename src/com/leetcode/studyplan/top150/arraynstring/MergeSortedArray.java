package com.leetcode.studyplan.top150.arraynstring;
// 88.Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
import java.util.Arrays;
import java.util.HashMap;
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i=0;i<n;i++){
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray(); // static 메서드가 아니니까(인스턴스 메서드) 객체화 해야함
        HashMap<String, Object> testCase = new HashMap<>();
        testCase.put("nums1ArrayList", new int[][]{{1, 2, 3, 0, 0, 0},{1},{0}});
        testCase.put("mArrayList",new int[]{3,1,0});
        testCase.put("nums2ArrayList",new int[][]{{2,5,6},{},{1}});
        testCase.put("nArrayList",new int[]{3,0,1});
        for(int i=0;i<3;i++){
            int[] nums1 = ((int[][]) testCase.get("nums1ArrayList"))[i];
            int m = ((int[]) testCase.get("mArrayList"))[i];
            int[] nums2 = ((int[][]) testCase.get("nums2ArrayList"))[i];
            int n = ((int[]) testCase.get("nArrayList"))[i];
            // 병합 메서드 실행
            System.out.printf("##########%n[TestCase %d]%nnums1 : %s%nm : %d%nnums2 : %s%nn : %d%n"
                    ,i+1
                    ,Arrays.toString(nums1)
                    ,m
                    ,Arrays.toString(nums2)
                    ,n
            );
            mergeSortedArray.merge(nums1, m, nums2, n);

        }
    }
}

