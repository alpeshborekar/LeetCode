class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0 ;
        int i = 0;
        int s = flowerbed.length;

        while(i < s){
            if(flowerbed[i] == 1){
                i = i + 2;
            }else{
                if((i == 0 || flowerbed[i-1] == 0) && ( i == s-1 || flowerbed[i+1] == 0 )){
                    count++;
                    i = i +2;
                }else{
                    i++;
                }
            }
        }
        if(count >= n){
            return true;
        }

        return false;
    }
}