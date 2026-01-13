class Solution {
    public int missingNumber(int[] nums) {
        int num = 0;
        Arrays.sort(nums);
        for(int i=0;i < nums.length;i++){
            if(nums[i] == num){
                num++;
            }
        }
        return num;
    }
}