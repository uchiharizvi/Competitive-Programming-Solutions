package Easy;

/**
 * Remove Duplicates from Sorted Array
 */
public class LC_026 {
    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums.length;
        int[] temp = new int[nums.length];
        //traversing
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++)
            // If current element is not equal to next element then store that current element
            if (nums[i] != nums[i + 1]) temp[j++] = nums[i];
        // Store the last element as whether it is unique or repeated, it hasn't stored previously
        temp[j++] = nums[nums.length - 1];

        for (int i = 0; i < j; i++) nums[i] = temp[i];
        return j;
    }
}
