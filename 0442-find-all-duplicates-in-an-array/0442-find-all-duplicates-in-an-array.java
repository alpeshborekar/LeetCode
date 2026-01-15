class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int val = arr[i] -1;
            if(arr[i] != arr[val]){
                swap(arr,i,val);
            }else{
                i++;
            }
        }
        // for finding all duplicates 
        List<Integer> ans = new ArrayList<>();
        for(int j = 0;j < arr.length;j++){
            if(arr[j] != j+1){
                ans.add(arr[j]);
            }
        }
        return ans;

    }

    static void swap(int[] arr ,int F , int S){
        int temp = arr[F];
        arr[F] = arr[S];
        arr[S] = temp;
    }
}