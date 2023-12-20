package Easy;

import java.util.Arrays;

public class LC_014 {
    public static void main(String[] args) {
        String[] values = {"wxyzw", "wlkjw", "wwwxxx"};
        System.out.println(longestCommonPrefix(values));
    }

    /**
     * Tc : 1ms
     * Sc : 42.5 MB
     */
    public static String longestCommonPrefix(String[] values) {
        if (values.length == 0) return " ";
        if (values.length == 1) return values[0];
        Arrays.sort(values);

        int end = Math.min(values[0].length(), values[values.length - 1].length());
        int i = 0;
        while (i < end && values[0].charAt(i) == values[values.length - 1].charAt(i)) {
            i++;
        }
        String result = values[0].substring(0, i);
        return result;
    }
}
