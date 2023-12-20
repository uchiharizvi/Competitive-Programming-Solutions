package com.cp.solutions.hackerearth.divisibility;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = 0;
        N = s.nextInt();
        long[] data = new long[N];
        long[] sum = new long[N];
        String ans = "No";
        BigInteger total = BigInteger.valueOf(0);
        for (int i = 0; i < N; i++) {
            data[i] = s.nextLong();
            sum[i] = data[i] % 10;
        }
        // Write your code here
        /*for (int i = N-1; i >= 0; --i) {
            ans = 10*ans + sum[i];
        }*/
        for (int i = 0; i < N; i++) {
            //total = 10 * total + sum[i];
            total = (total.multiply(BigInteger.TEN));
            total = total.add(BigInteger.valueOf(sum[i]));
        }
        System.out.println("total: " + total);
        //if(total%BigInteger.valueOf(10) == 0) ans = "Yes";
        System.out.println(ans);
    }
}
