package Easy;

public class ReverseIntegerProblem {
    public int reverse(int x) {
        //Handling negative
        boolean negFlag = false;
        if (x < 0) {
            negFlag = true;
            x = -x;
        }
        int previousReverseNum = 0;
        int reverseNum =0;
        while (x != 0) {
            int currentDigit = x%10;
            reverseNum = reverseNum * 10 + currentDigit;
            if((reverseNum-currentDigit)/10 != previousReverseNum) return 0;
            previousReverseNum = reverseNum;
            x = x / 10;
        }
        return (negFlag == true) ? -reverseNum : reverseNum;
    }

    public static void main(String[] args) {
        ReverseIntegerProblem reverse = new ReverseIntegerProblem();
        int num = 1000000045;
        System.out.println("Reverse of " + num + " is " + reverse.reverse(num));
    }
}
