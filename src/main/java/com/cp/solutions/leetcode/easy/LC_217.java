package Easy;

import java.util.*;
/**
 * Algorithm
 * 1) For each element of array, add it into a set (get unique values)
 * 2) compare set size with array length
 * 3) if same return F else return T
 * **/
public class LC_217 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 5, 6, 7};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(checkDuplicates3(arr));
        System.out.println(checkDuplicates3(arr1));
    }

    /**
     * Runtime 25 MS | Mem: 65.7 MB -  Brute Force
     **/
    private static boolean checkDuplicates(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return true;
            }
        }
        return false;
    }

    /**
     * Runtime 14 MS | Mem: 51.8 MB - Using Set DS and Array Comparison
     **/
    private static boolean checkDuplicates2(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int elem : arr) set.add(elem);
        if (arr.length > set.size()) return true;
        return false;
    }
    /**
     * Runtime 14 MS | Mem: 69.9 MB - Using HashSet Add() Method
     **/
    private static boolean checkDuplicates3(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int elem : arr) {
            if(!(set.add(elem))) return true;
        }
        return false;
    }
}
