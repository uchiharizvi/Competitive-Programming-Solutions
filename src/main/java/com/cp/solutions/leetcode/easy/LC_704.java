package Easy;

public class LC_704 {
    public static void main(String[] args) {
        //TC 1
        int[] arr = {-1, 0, 3, 5, 9, 12};
        int target =2;
        //TC 2
        //int[] arr = {5};
        //int target = 5;
        System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
        return linearSearch(nums, target);

    }
    /**2 MS**/
    private static int linearSearch(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }
}
