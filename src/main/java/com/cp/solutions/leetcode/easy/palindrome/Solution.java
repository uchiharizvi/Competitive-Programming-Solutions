package com.cp.solutions.leetcode.easy.palindrome;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int[] digits = toDigitArray(x);
        int l = 0, r = digits.length - 1;
        while (l < r) {
            if(digits[l]!=digits[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    private int[] toDigitArray(int num) {
        int temp = num, length = 0;
        while (temp > 0) {
            length++;
            temp /= 10;
        }
        int[] digits = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }
}
