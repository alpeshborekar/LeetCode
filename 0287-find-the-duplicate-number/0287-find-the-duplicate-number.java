class Solution {
    public int findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int val = arr[i] - 1;
            if(arr[i] != arr[val]){
                swap(arr ,i ,val);
            }else{
                i++;
            }
        }

        // finding the duplicate number
        
        for(int j = 0 ;j < arr.length;j++){
            if(arr[j] != j+1){
                return arr[j];
            }
        }
        return -1;
        
    }

    static void swap(int[] arr , int f , int S){
        int temp = arr[f];
        arr[f] = arr[S];
        arr[S] = temp;
}
}