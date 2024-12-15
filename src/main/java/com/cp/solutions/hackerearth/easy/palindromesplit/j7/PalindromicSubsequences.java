package com.cp.solutions.hackerearth.easy.palindromesplit.j7;

import java.util.*;

public class PalindromicSubsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of test cases
        int t = Integer.parseInt(scanner.nextLine());
        String[] testCases = new String[t];

        // Read all test cases
        for (int i = 0; i < t; i++) {
            testCases[i] = scanner.nextLine();
        }

        // Process each test case
        for (String s : testCases) {
            System.out.println(maxPalindromicSubsequences(s));
        }

        scanner.close();
    }

    private static int maxPalindromicSubsequences(String s) {
        // Frequency array for counting characters (lowercase a-z)
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int count = 0;
        // Calculate number of palindromic subsequences
        for (int f : freq) {
            count += f / 2;
        }

        return count;
    }
}