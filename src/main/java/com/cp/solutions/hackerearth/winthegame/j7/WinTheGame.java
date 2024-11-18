package com.cp.solutions.hackerearth.winthegame.j7;

import java.util.Scanner;

public class WinTheGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();

        //Iterate through the test cases
        for (int t = 0; t < T; t++) {
            int R = scanner.nextInt();
            int G = scanner.nextInt();

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
                        double kunalTurn = (double) i / (i + j) * dp[i - 1][j] + (double) j / (i + j) * dp[i][j - 1];
                        dp[i][j] = satyamTurn;
                    }
                }
            }
            System.out.printf("%.6f%n", dp[R][G]);
        }
        scanner.close();
    }
}
