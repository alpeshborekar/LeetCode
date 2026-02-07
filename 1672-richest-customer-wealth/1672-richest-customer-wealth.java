class Solution {
    public int maximumWealth(int[][] arr) {
        int maximumwealth = 0;

        for(int row = 0 ; row < arr.length ;row++){
            int currentwealth = 0;

            for(int col =0 ;col < arr[row].length;col++){
                currentwealth = currentwealth + arr[row][col];
            }

            if(currentwealth > maximumwealth){
                maximumwealth = currentwealth;
            }

        }
        return  maximumwealth;
        
    }
}