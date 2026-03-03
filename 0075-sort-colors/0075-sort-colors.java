class Solution {

    public void sortColors(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
    }

    private void mergeSort(int[] arr, int low, int high) {

        if (low >= high) return;

        int mid = low + (high - low) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high) {

        int start = low;
        int start2 = mid + 1;

        while (start <= mid && start2 <= high) {

            if (arr[start] <= arr[start2]) {
                start++;
            } else {

                int value = arr[start2];
                int index = start2;

                while (index > start) {
                    arr[index] = arr[index - 1];
                    index--;
                }

                arr[start] = value;

                start++;
                mid++;
                start2++;
            }
        }
    }
}