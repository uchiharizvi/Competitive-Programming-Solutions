package Easy;

import java.util.ArrayList;
import java.util.List;

public class TwoSumSolution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            if ((nums[i] + nums[i + 1]) == target) {
                result = new int[]{i, i + 1};
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Starting code for Two Sum");
        System.out.println("Given nums are : ");
        int target = 6;
        int[] arr = new int[]{3,2,3};
        List<Integer> list = new ArrayList<>();
        for (int elem : arr) list.add(elem);
        System.out.println(list);
        System.out.println("Target is : " + target);
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        int[] result = twoSumSolution.twoSum(arr, target);
        for (int i = 0; i < result.length-1; i++) {
            if (result[i] == 0 && result[i+1] ==0) {
                System.out.println("Element not found");
            }else{
                System.out.println(result[i]);
            }
        }

    }
}
