class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            // move left if even
            if (nums[left] % 2 == 0) {
                left++;
            }
            // move right if odd
            else if (nums[right] % 2 != 0) {
                right--;
            }
            // swap odd on left with even on right
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        return nums;
    }
}
