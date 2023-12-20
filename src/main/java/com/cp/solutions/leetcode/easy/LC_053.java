package Easy;

import java.util.*;

public class LC_053 {
    public static void main(String[] args) {
        Set<Integer> res = new TreeSet<>();
        int[] arr = {5, 4, -1, 7, 8};
        System.out.println(calculateSubArray(arr));
    }

    /**
     * Divide and Conquer Approach 21 MS | 90 MB |
     * TC - O(NlogN) | SC - O(logN)
     **/
    private static int calculateSubArray(int[] nums) {
        return helper(0, nums.length - 1, nums);
    }

    /**
     * Divide and Conquer Approach 21 MS | 90 MB |
     * TC - O(NlogN) | SC - O(logN)
     **/
    private static int helper(int i, int j, int[] nums) {
        if (i == j) return nums[i];
        int left = Integer.MIN_VALUE, right = Integer.MIN_VALUE;
        int mid = (i + j) / 2;
        int cur = 0;//pointer
        for (int k = mid + 1; k <= j; k++) {
            cur += nums[k];
            right = Math.max(right, cur);
        }
        cur = 0;
        for (int k = mid; k >= i; k--) {
            cur += nums[k];
            left = Math.max(left, cur);
        }
        int totalSum = left + right;
        int leftSum = helper(i, mid, nums);
        int rightSum = helper(mid + 1, j, nums);

        return Math.max(totalSum, Math.max(leftSum, rightSum));

    }

    /**
     * Kadane's Algorithm for sub Arrays
     * TC - O(N) | SC - O(1)
     **/
    private static int calculateSubArray2(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int cur = 0;
        for (int x : nums) {
            if (cur < 0) cur = 0;
            cur += x;
            maxSum = Math.max(maxSum, cur);
        }
        return maxSum;
    }
}
