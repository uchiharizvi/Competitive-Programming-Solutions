package com.cp.solutions.hackerrank.hourglass;

import java.util.List;

public class Result {
    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        for(List<Integer> elem:arr)
            for(int i=0; i<elem.size();i++){
                System.out.println("Hourglass : ");
                System.out.println(elem.get(i));
            }
        //System.out.println(elem);
        //hourglass -- 1st 3 elem of elem[o], 2nd elem of elem[1] and 1st 3 elem of arr[2]
        return 0;
    }
}
