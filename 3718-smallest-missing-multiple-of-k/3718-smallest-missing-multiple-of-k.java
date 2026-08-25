class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int r=k;
        while(true){
            if(!set.contains(r)){
                return r;
            }
            r+=k;
        }
    }
}