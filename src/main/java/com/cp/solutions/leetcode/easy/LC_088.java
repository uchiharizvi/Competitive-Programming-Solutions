package Easy;

import java.util.Arrays;

public class LC_088 {
    public static void main(String[] args) {
        int[] ar1 = {1, 3, 5, 7, 9};
        int[] ar2 = {2, 4, 6, 8, 10};
        merge(ar1, 5, ar2, 5);
    }

    /**
     * 4 MS | 40 MB
     **/
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < m + n && j < n; i++) {
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
