package Easy;

import java.util.Hashtable;
/**Algorithm Brute Force method
 * 1) loop i and j till array length , i=0, j= i+1
 * 2) if arr[i][j] = target, return i,j
 * 3) if no match found return -1,-1
 *
 *
 * **/
public class LC_001_a {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        for (int x : twoSum_Pointers(arr, target))
            System.out.print(x + " ");

    }

    /**
     * Approach Hashing
     **/
    public static int[] twoSum_hashing(int[] nums, int target) {
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        int[] pair = {};
        Boolean foundPair = false;
        int i = 0;
        while (i < nums.length) {
            hashtable.put(nums[i], i);
            i++;
        }
        i = 0;
        while (i < nums.length && !(foundPair)) {
            int compliment = target - nums[i];
            if (hashtable.contains(compliment)) {
                if (i != hashtable.get(compliment)) {
                    pair[i] = i;
                    pair[i + 1] = hashtable.get(compliment);
                    foundPair = true;
                }
            }
            i++;
        }
        return pair;
    }

    /**
     * Approach : Brute Force
     * 48MS | 39.4 MB
     * TC = O(N * N)
     * SC = O(1)
     **/
    public static int[] twoSum_BF(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSum_Pointers(int[] nums, int target) {
        int left = 0, right = nums.length - 1, tempSum;
        while (left < right) {
            tempSum = nums[left] + nums[right];
            if (tempSum == target) return new int[]{left + 1, right + 1};
            if (tempSum > target) right--;
            else left++;
        }
        return new int[]{-1, -1};
    }
}
