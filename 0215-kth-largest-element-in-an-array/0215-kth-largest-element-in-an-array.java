class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        Arrays.sort(nums);   // sort in ascending order
        
        return nums[nums.length - k];
    }
}