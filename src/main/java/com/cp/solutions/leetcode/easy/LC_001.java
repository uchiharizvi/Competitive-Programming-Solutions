package Easy;

import java.util.HashMap;

public class LC_001 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum_HashMap(nums, target);
    }

    /**
     * Brute Force Method
     * TC: 128 ms
     * SC: 44.8 MB
     */
    static int[] twoSum_BruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }

        }
        throw new IllegalArgumentException("No Two Sum Solution");
    }
    /**
     * HashMap
     * TC: 3 ms
     * SC: 45.7 MB
     */
    static int[] twoSum_HashMap(int[] nums, int target) {
        HashMap<Integer, Integer> preComputed = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(preComputed.containsKey(target-nums[i])) return new int[]{preComputed.get(target-nums[i]),i};
            preComputed.put(nums[i],i);
        }
        throw new IllegalArgumentException("No Two Sum Solution");
    }

}
