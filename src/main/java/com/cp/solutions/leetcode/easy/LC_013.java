package Easy;

/**
 * Roman to Integer
 **/
public class LC_013 {

    public static void main(String[] args) {
        String s = "VIII";
        System.out.println(romanToInt(s));
    }

    /**
     * Tc : 7 ms
     * Sc : 44.9 MB
     */
    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int x = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int y = value(s.charAt(i + 1));
                if (x >= y) sum += x;
                else sum -= x;
            } else sum += x;
        }
        return sum;
    }

    /**
     * Tc : 3 ms
     * Sc : 39.8 MB
     */
    public static int romanToInt_2(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int x = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int y = value(s.charAt(i + 1));
                if (x >= y) sum += x;
                else {
                    sum = sum + y - x;
                    i++;
                }
            } else {
                sum += x;
                i++;
            }
        }
        return sum;
    }

    private static int value(char x) {
        if (x == 'I') return 1;
        if (x == 'V') return 5;
        if (x == 'X') return 10;
        if (x == 'L') return 50;
        if (x == 'C') return 100;
        if (x == 'D') return 500;
        if (x == 'M') return 1000;
        return -1;
    }


}
/**
 * Use Cases
 * 1) Numbers from II to III
 * 2) Numbers IV and VI,VII and VIII
 * 3) Numbers IX,XI,XII,XIII
 */

