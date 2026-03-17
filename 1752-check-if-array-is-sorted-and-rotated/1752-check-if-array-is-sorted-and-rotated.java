class Solution {
    
    public boolean check(int[] nums) {
        int n = nums.length;

        // Try all rotations
        for (int k = 0; k < n; k++) {
            int[] rotated = rotate(nums, k);

            if (isSorted(rotated)) {
                return true;
            }
        }

        return false;
    }

    // Rotate array right by k
    private int[] rotate(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[(i + k) % n] = nums[i];
        }

        return res;
    }

    // Check if sorted
    private boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}