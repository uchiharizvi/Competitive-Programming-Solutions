package com.cp.solutions.hackerearth.easy.makepalindrome.java7;

import java.util.Scanner;

public class MakePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        while (T-- > 0) {
            int N = scanner.nextInt(); // Length of the string
            String S = scanner.next(); // The string itself

            // Frequency array for lowercase letters a-z
            int[] frequency = new int[26];

            // Count frequency of each character
            for (char c : S.toCharArray()) {
                frequency[c - 'a']++;
            }

            // Count how many characters have an odd frequency
            int oddCount = 0;
            for (int count : frequency) {
                if (count % 2 != 0) {
                    oddCount++;
                }
            }
            // To form a palindrome:
            // If there are more than one odd frequency characters, we need to add characters
            // The minimum cost will be (oddCount - 1) as we can have at most one odd frequency character
            // for the middle of the palindrome.
            System.out.println(Math.max(0, oddCount - 1));
        }
        scanner.close();
    }
}

