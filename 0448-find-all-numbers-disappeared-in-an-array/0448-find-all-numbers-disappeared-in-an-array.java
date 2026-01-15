import java.util.*;

class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        sort(nums);

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int missing = i + 1;
            if (nums[i] != missing) {
                ans.add(missing);
            }
        }
        return ans;
    }

    static void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
