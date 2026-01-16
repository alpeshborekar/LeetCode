class Solution {
    public int[] findErrorNums(int[] nums) {
        int i =0;
        while(i < nums.length){
            int val = nums[i] -1;
            if(nums[i] != nums[val]){
                swap(nums , i ,val);
            }else{
                i++;
            }
        }

        // set mismatch
        for(int j = 0 ;j < nums.length ;j++){
            if(nums[j] != j+1){
                return new int[]{nums[j] , j+1};

            }

        }
        return new int[]{};

    }

    static void swap(int[] arr, int F , int S ){
        int temp = arr[F];
        arr[F] = arr[S];
        arr[S] = temp;

    }
}