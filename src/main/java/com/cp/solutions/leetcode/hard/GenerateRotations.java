package com.cp.solutions.leetcode.hard;
/** Given an integer n, the task is to generate all the left shift numbers possibleA left shift number is a number
 *  that is generated when all the digits of the number are shifted one position to the left and the digit at the
 *  first position is shifted to the last.
 *  Examples:
 * Input: n = 123
 * Output: 231 312
 *
 * Input: n = 1445
 * Output: 4451 4514 5144

 * Approach:

 * Assume n = 123.
 * Multiply n with 10 i.e. n = n * 10 = 1230.
 * Add the first digit to the resultant number i.e. 1230 + 1 = 1231.
 * Subtract (first digit) * 10k from the resultant number where k is the number of digits in the original number (in this case, k = 3).
 * 1231 – 1000 = 231 is the left shift number of the original number.**/
public class GenerateRotations {

    public static void main(String[] args) {
        int num = 1445;
        cal(num);
    }

    private static void cal(int num) {
        int digits = numberOfDigits(num);
        int powTen = (int) Math.pow(10, digits - 1);

        for (int i = 0; i < digits - 1; i++) {
            int firstDigit = num / powTen;
            // Formula to calculate left shift
            // from previous number 
            int left = ((num * 10) + firstDigit) - (firstDigit * powTen * 10);
            System.out.print(left + " ");
            // Update the original number
            num = left;
        }
    }

    private static int numberOfDigits(int num) {
        int cnt = 0;
        while (num > 0) {
            cnt++;
            num /= 10;
        }
        return cnt;
    }


}
