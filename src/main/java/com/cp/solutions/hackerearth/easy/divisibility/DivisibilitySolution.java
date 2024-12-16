package com.cp.solutions.hackerearth.easy.divisibility;

import java.util.Scanner;

public class DivisibilitySolution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //Step 1: Read N
        int N = scanner.nextInt();

        //Step 2 : Read N numbers, but we only care about the last one
        int lastNumber = 0;
        for (int i= 0; i< N; i++) {
            lastNumber = scanner.nextInt();
        }

        //Step 3: Check if the last digit of the last number is 0
        if (lastNumber % 10 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }

}
