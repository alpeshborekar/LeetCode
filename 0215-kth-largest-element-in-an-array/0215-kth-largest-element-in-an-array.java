class Solution {

    public int findKthLargest(int[] nums, int k) {
        int target = nums.length - k;  
        return quickSelect(nums, 0, nums.length - 1, target);
    }

    private int quickSelect(int[] arr, int low, int high, int target) {

        if (low == high) return arr[low];

        int pivotIndex = partition(arr, low, high);

        if (pivotIndex == target) {
            return arr[pivotIndex];
        } 
        else if (pivotIndex < target) {
            return quickSelect(arr, pivotIndex + 1, high, target);
        } 
        else {
            return quickSelect(arr, low, pivotIndex - 1, target);
        }
    }

    private int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}