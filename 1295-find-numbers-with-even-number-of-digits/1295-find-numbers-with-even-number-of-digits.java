class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for(int i = 0 ;i < nums.length;i++){

            int countdigit =0;

            while(nums[i] > 0){
                countdigit++;
                nums[i] /= 10;
            }
            if(countdigit % 2 ==0){
                count++;
            }
        }
        return count;
    }
}