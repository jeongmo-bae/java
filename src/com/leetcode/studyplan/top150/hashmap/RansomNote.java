package com.leetcode.studyplan.top150.hashmap;

import com.leetcode.studyplan.top150.twopointers.ValidPalindrome;

import java.util.HashMap;
import java.util.Map;

// 383. Ransom Note
// https://leetcode.com/problems/ransom-note/description/?envType=study-plan-v2&envId=top-interview-150
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> ransomCharCountMap = new HashMap<>();
        HashMap<Character,Integer> magazineCharCountMap = new HashMap<>();
        for (char ch : ransomNote.toCharArray()){
            ransomCharCountMap.put(ch,ransomCharCountMap.getOrDefault(ch,0)+1);
        }
//        System.out.println(ransomCharCountMap);
        for (char ch : magazine.toCharArray()){
            magazineCharCountMap.put(ch,magazineCharCountMap.getOrDefault(ch,0)+1);
        }
//        System.out.println(magazineCharCountMap);
        boolean res = true;
        for (HashMap.Entry<Character,Integer> ransomEntry : ransomCharCountMap.entrySet()){
            char key = ransomEntry.getKey();
            int value = ransomEntry.getValue();
            if(!magazineCharCountMap.containsKey(key)||magazineCharCountMap.getOrDefault(key,0)<value){
                res = false;
                break;
            }
        }
        return res;

    }

    public static void main(String[] args){
        RansomNote ransomNote = new RansomNote();
        HashMap<String,String[]> testCase = new HashMap<>();
        testCase.put("ransomNoteArrayList",new String[]{"a","aa","aa"});
        testCase.put("magazineArrayList",new String[]{"b","ab","aab"});

        for (int i=0; i < 3 ; i++){
            System.out.println(
                    ransomNote.canConstruct(
                            testCase.get("ransomNoteArrayList")[i]
                            ,testCase.get("magazineArrayList")[i]
                    )
            );
        }
    }
}
