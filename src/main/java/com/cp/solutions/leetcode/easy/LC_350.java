package Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC_350 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        int[] res = {};
        res = intersect_ptr(arr, arr2);
        for (int i = 0; i < compare(arr, arr2); i++)
            System.out.println(res[i]);
    }

    /**
     * Approach : HashMap | 6 MS | 44.5 MB
     * Time : O(n+m)
     * Space : O(min(n,m))
     * Algorithm:
     * 1) store the count of each element of one array in Map
     * 2) traverse through the second array
     * 3) check array 2 count with map
     **/
    public static int[] intersect_hashmap(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return intersect_hashmap(nums2, nums1);
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : nums1) map.put(val, map.getOrDefault(val, 0) + 1);
        int k = 0;
        for (int val : nums2) {
            if (map.getOrDefault(val, 0) > 0) {
                nums1[k++] = val;
                map.put(val, map.get(val) - 1);
            }
        }
        int ans[] = new int[k];
        for (int i = 0; i < k; i++) ans[i] = nums1[i];
        return ans;
    }

    /**
     * Approach : Pointers | 1 MS | 42.6 MB
     * Time : O(log n+log m)
     * Space : O(max(log n,log m)) to O(max(n,m)) - can be reduced by efficient sorting algorithm:
     * 1)
     * 2)
     * 3)
     **/
    public static int[] intersect_ptr(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) i++;
            else if (nums1[i] > nums2[j]) j++;
            else {
                nums1[k++] = nums1[i];
                ++i;
                ++j;
            }
        }
        int ans[] = new int[k];
        for (i = 0; i < k; i++) ans[i] = nums1[i];
        return ans;
    }

    private static int compare(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return nums2.length;
        else return nums1.length;
    }
}
