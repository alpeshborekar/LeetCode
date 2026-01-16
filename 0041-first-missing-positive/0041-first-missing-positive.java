class Solution {
    public int firstMissingPositive(int[] arr) {
        
        int i = 0;
        while(i < arr.length){
            int val = arr[i] -1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[val]){
                swap(arr,i,val);
            }else{
                i++;
            }
        }

        // first positive missing
        for(int j= 0 ;j < arr.length;j++){
            if(arr[j] != j+1){
                return j+1;
            }
        }

        return arr.length+1;

}

static void swap(int[] arr , int F , int S){
    int temp = arr[F];
    arr[F] = arr[S];
    arr[S] = temp;

}

}
