class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;

        for(int i = 0 ;i < nums.length;i++){

            int num = nums[i];
            int countdigit =0;

            while(num > 0){
                countdigit++;
                num /= 10;
            }
            if(countdigit % 2 ==0){
                count++;
            }
        }
        return count;
    }
}