package com.cp.solutions.hackerearth.winthegame.j8;

import java.util.Scanner;
import java.util.stream.IntStream;

public class WinTheGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        //Iterate through the test cases
        IntStream.range(0, T).forEach(y -> {
            int R = scanner.nextInt();
            int G = scanner.nextInt();
            System.out.printf("%.6f%n", calculateWinningProbability(R, G));
        });
        scanner.close();
    }

    private static double calculateWinningProbability(int R, int G) {
        if (R == 0) return 1.0;
        if (G == 0) return 0.0;
        //DP table to store probabilities
        double[][] dp = new double[R + 1][G + 1];
        //Fill the DP table
        for (int i = 0; i <= R; i++) {
            for (int j = 0; j <= G; j++) {
                if (i == 0) {
                    dp[i][j] = 1.0;
                } else if (j == 0) {
                    dp[i][j] = 0.0;
                } else {
                    double satyamTurn = (double) j / (i + j) * dp[i][j - 1];
                    dp[i][j] = satyamTurn; // Only Satyam's turn matters for the result
                }
            }
        }
        return dp[R][G];
    }
}
