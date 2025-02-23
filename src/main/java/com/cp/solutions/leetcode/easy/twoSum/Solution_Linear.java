package com.cp.solutions.leetcode.easy.twoSum;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Time Complexity O(n)
 * Space Complexity O(n)
 */
public class Solution_Linear {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>(); //store number and index
        for (int i=0; i< numbers.length; i++) {
            int complement = target - numbers[i];
            if(numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            }
            numMap.put(numbers[i], i);
        }
        throw new IllegalArgumentException("No Two Sum Solution");
    }

    public static void main(String[] args) {
        Solution_Linear solution = new Solution_Linear();
        int[] nums = {2,5};
        int target = 8;
        System.out.println(solution.twoSum(nums, target));
    }
}
