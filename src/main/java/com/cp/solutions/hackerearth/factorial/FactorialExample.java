package com.cp.solutions.hackerearth.factorial;

import java.util.Scanner;

public class FactorialExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(factorial(number));
    }

    private static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n-1);
    }
}
