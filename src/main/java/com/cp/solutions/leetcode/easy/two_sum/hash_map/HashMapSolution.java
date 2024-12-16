package com.cp.solutions.leetcode.easy.two_sum.hash_map;

import java.util.HashMap;

public class HashMapSolution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>(); //store number and index
        for (int i=0; i< nums.length; i++) {
            int complement = target - nums[i];
            if(numMap.containsKey(complement)) {
                return new int[] {numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        throw new IllegalArgumentException("No Two Sum Solution");
    }
}
