package com.leetcode.studyplan.top150.twopointers;

// 125. Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sbReversed = new StringBuffer();
        s = s.toLowerCase();
        for (int i=0;i < s.length(); i++){
            char str = s.charAt(i);
            // 숫자 0~9 : 48 ~ 57 , 영소문자 : 97~122 , 영대문자 : 65~90
            boolean condition = (
                    ((int) str >= 48 && (int) str <= 57)
                            || ((int) str >= 65 && (int) str <= 90)
                            || ((int) str >= 97 && (int) str <= 122)
            );
            if (condition){
                sb.append(str);
                sbReversed.insert(0,str);
            }
        }
//        System.out.println(sb);
//        System.out.println(sbReversed);
        if (sb.toString().equals(sbReversed.toString())){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String[] testCase = {"A man, a plan, a canal: Panama","race a car","  "};
        for (int i=0; i < testCase.length ; i++){
            System.out.println(validPalindrome.isPalindrome(testCase[i]));
        }
    }
}
