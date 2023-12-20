package Easy;

public class LC_009 {
    public static void main(String[] args) {
        //Handle negative case
        int x = 021;
        System.out.println(isPalindrome_R(x));
    }

    /**
     * Traditional Approach
     * TC : 13 ms
     * SC : 45.6 MB
     **/
    public static boolean isPalindrome(int x) {
        String convertedX = String.valueOf(x);
        if (convertedX.charAt(0) == '-') return false;
        int number = x;
        int remainder = 0;
        int reverse = 0;
        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        if (x == reverse) return true;
        return false;
    }
    /**
     * Recursive Approach
     * TC : 11ms
     * SC : 45.3 MB
     **/
    public static boolean isPalindrome_R(int x) {
        boolean negative = x < 0 ? true : false;
        if (negative) return false;
        int reverse = reverse(x);
        return x == reverse ? true:false;
    }

    private static int reverse(int x) {
        int remainder = 0;
        int reverse = 0;
        while (x >= 1) {
            remainder = x % 10;
            reverse = reverse * 10 + remainder;
            x = x / 10;
        }
        return reverse;
    }
}
