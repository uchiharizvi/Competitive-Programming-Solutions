package Easy;

/*Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M
* Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
* For example, two is written as II in Roman numeral, just two one's added together.
* Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
*
* Q) Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999.
* Example 1:
Input: "III"
Output: 3
*
Example 2:
Input: "IV"
Output: 4*/
public class RomanToInteger {
    public static void main(String[] args) {

        RomanToInteger roman = new RomanToInteger();
        String x = "MCMXCIV"; //1100+1010 //"MCMXCIV"; //Output should be 1994
        System.out.println("Integer value for Roman Number " + x + " is " + roman.romanToInt(x));
    }

    public int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));

            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i+1));
                if (s1 >= s2) result += s1;
                else {
                    result = result + s2 - s1;
                    i++;
                }
            } else {
                result = result + s1;
                i++;
            }
        }
        return result;
    }

    private int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }
}
