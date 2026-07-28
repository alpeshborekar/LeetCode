class Solution {
    public int longestOnes(int[] nums, int k) {

        int ZeroCount = 0;
        int maxWindo = 0;
        int left = 0;

        for(int right = 0 ;right < nums.length;right++ ){

            if(nums[right] == 0){
                ZeroCount++;
            }

            while(ZeroCount > k){

                if(nums[left] == 0){
                    ZeroCount--;
                }

                left++;
            }

            maxWindo =  Math.max(maxWindo , right -left +1);
        }
        
        return maxWindo;
    }
}