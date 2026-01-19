class Solution {
    public int singleNumber(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        Arrays.sort(nums);

        for(int i = 0 ;i < nums.length -1;i+=3){
            if(nums[i] != nums[i+2] ){
                return nums[i];
            }
        }
        return nums[nums.length -1];
        
    }
}