package com.cp.solutions.leetcode.easy.two_sum;

import com.cp.solutions.leetcode.easy.two_sum.brute_force.BruteForceSolution;
import com.cp.solutions.leetcode.easy.two_sum.hash_map.HashMapSolution;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
//        BruteForceSolution solution = new BruteForceSolution();
        HashMapSolution solution = new HashMapSolution();
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices : [" + result[0] + ", " + result[1] + "]");
    }
}
