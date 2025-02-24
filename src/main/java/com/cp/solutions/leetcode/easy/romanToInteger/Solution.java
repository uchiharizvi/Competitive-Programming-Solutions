package com.cp.solutions.leetcode.easy.romanToInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("MCMXCIV"));

    }
    public int romanToInt(String s) {
        Map<Character, Integer> romanRule = new HashMap<>();
        initialize(romanRule);
        int result = 0;
        int prevVal = 0;

        for(int i=s.length()-1;i>=0;i--) {
            int currVal = romanRule.get(s.charAt(i));
            if(currVal < prevVal) {
                result -= currVal;
            }else {
                result += currVal;
            }
            prevVal = currVal;
        }
        return result;
    }

    private void initialize(Map<Character, Integer> romanRule) {
        romanRule.put('I', 1);
        romanRule.put('V', 5);
        romanRule.put('X', 10);
        romanRule.put('L', 50);
        romanRule.put('C', 100);
        romanRule.put('D', 500);
        romanRule.put('M', 1000);

    }
}
