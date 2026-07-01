class Solution {
    public int maxArea(int[] height) {


        int max = 0 ;
        int L = 0;
        int R = height.length - 1;

        while(L < R){

            int w = R - L;
            int h = Math.min(height[L] ,height[R]);
            
            int A = w * h;

            max = Math.max(max , A);

            if(height[L] < height[R]){
                L++;
            }else{
                R--;
            } 
        }
        return max;
    }
}