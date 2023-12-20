package com.cp.solutions.hackerearth.fredohurry;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        long T = Long.parseLong(line);
        for (long i = 0; i < T; i++) {
            line = scan.nextLine();
            long N = Long.parseLong(line);
            long minF =0, maxF= N;
            long curF = maxF/2;
            while(curF >minF && curF < maxF){
                long tForFToReachCurF = (curF * (curF+1))/2;
                long tForLiftToReachCurF = N -curF;
                if((tForFToReachCurF) > tForLiftToReachCurF){
                    maxF=curF;
                    curF = curF/2 > minF ? curF/2:(minF+maxF)/2;
                }else{
                    minF = curF;
                    curF = (minF+ maxF)/2;
                }
            }
            long total = N==1?1:2 * (N-(curF));
            System.out.println(total);
        }
    }
}
