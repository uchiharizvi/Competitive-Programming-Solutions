package Easy;

/**
 * Implement strStr()
 */
public class LC_028 {
    public static void main(String[] args) {
        LC_028 obj = new LC_028();
        int result = obj.strStr("a", "a");
        System.out.println(result);
    }

    public int strStr(String haystack, String needle) {
        int M = haystack.length();
        int N = needle.length();
        for (int i = 0; i <= M - N; i++) {
            int j;
            for (j = 0; j < N; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
            }
            if (j == N) return i;
        }
        return -1;
    }
}
