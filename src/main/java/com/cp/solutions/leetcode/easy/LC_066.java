package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Valid Parenthesis
 */
public class LC_066 {
    public static void main(String[] args) {
        LC_066 obj = new LC_066();
        int[] input = {9};
        System.out.println(obj.checkIfEndDigit(input, 9));
        System.out.println("Input");
        Arrays.stream(input).forEach(System.out::println);
        int[] output = obj.plusOne(input);
        System.out.println();
        System.out.println("Output");
        Arrays.stream(output).forEach(System.out::println);
    }

    public int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<>();
        int number = 0;
        int range = 9;
        for (int i = 0; i < digits.length; i++) {
            number = 10 * number + digits[i];
        }
        number += 1;
        int digit = 0;
        int temp = number;
        while (temp > 0) {
            digit = temp % 10;
            temp = temp / 10;
            result.add(digit);
        }

        List<Integer> finalRes = result.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        return finalRes.stream().mapToInt(i -> i).toArray();
    }

    boolean checkIfEndDigit(int[] digits, int range) {
        int n = digits.length;
        for (int i = 0; i < n; i++) {
            if (Math.abs(digits[i]) == range) {
                int z = Math.abs(digits[i]) - range;
                if (digits[z] > 0) digits[z] = digits[z] * -1;
            }
        }
        int count = 0;
        for (int i = 0; i <= range && i < n; i++) {
            // Element from range is missing from array
            if (digits[i] > 0)
                return false;
            else
                count++;
        }
        if (count != (range + 1))
            return false;
        // All range elements are present
        return true;
    }
}
