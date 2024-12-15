package com.cp.solutions.hackerearth.easy.palindromesplit.j8;

import java.util.*;
import java.util.stream.Collectors;

public class PalindromicSubsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of test cases
        int t = Integer.parseInt(scanner.nextLine());

        // Process each test case
        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            System.out.println(maxPalindromicSubsequences(s));
        }

        scanner.close();
    }

    private static int maxPalindromicSubsequences(String s) {
        // Use streams to count frequencies and calculate the result
        return s.chars() // Convert string to stream of characters
                .mapToObj(c -> (char) c) // Convert to Character objects
                .collect(Collectors.groupingBy(c -> c, Collectors.counting())) // Count occurrences
                .values() // Get counts
                .stream() // Stream of counts
                .mapToInt(count -> (int) (count / 2)) // Calculate pairs
                .sum(); // Sum up all pairs
    }
}