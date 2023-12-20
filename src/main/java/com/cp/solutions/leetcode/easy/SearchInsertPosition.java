package Easy;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 5;
        System.out.println(SearchInsertPosition.searchInsertPos(arr, target));

    }

    public static int searchInsertPos(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
            else if (target > nums[mid])
                start = mid + 1;
            else if (target < nums[mid])
                end = mid - 1;
        }
        return start;
    }
}
