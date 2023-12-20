package Easy;

/**
 * Remove Duplicates from Sorted Array
 */
public class LC_027 {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0;
        while (j < nums.length) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        return i;
    }
}
