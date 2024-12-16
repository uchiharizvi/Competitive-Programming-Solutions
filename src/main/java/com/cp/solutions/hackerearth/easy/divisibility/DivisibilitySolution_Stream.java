package com.cp.solutions.hackerearth.easy.divisibility;

import java.util.Scanner;
import java.util.stream.IntStream;

public class DivisibilitySolution_Stream {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                IntStream.range(0, scanner.nextInt())
                        .map(i -> scanner.nextInt())
                        .reduce((a, b) -> b) // Get the last number
                        .isPresent() && IntStream.range(0, scanner.nextInt())
                        .map(i -> scanner.nextInt())
                        .reduce((a, b) -> b).getAsInt() % 10 == 0 ? "Yes" : "No"
        );
        scanner.close();
    }
}
