package com.cp.solutions.hackerearth.easy.makepalindrome.java8;

import java.util.Scanner;
import java.util.stream.Collectors;

public class MakePalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases

        scanner.nextLine();
        while (T-- > 0) {
            int N = scanner.nextInt(); // Length of the string
            String S = scanner.next(); // The string itself

            int cost = (int) S.chars()
                    .mapToObj(c -> (char) c)
                    .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                    .values()
                    .stream()
                    .filter(count -> count % 2 != 0)
                    .count();

            cost = Math.max(0, cost - 1);
            System.out.println(cost);
        }
        scanner.close();
    }
}

