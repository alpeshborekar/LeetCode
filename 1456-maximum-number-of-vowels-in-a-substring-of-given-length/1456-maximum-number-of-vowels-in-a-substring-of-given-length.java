class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;

        for(int i = 0 ;i < k; i++){
            if(isVowels(s.charAt(i))){
                count++;
            }
        }
    

        int maxcount = count;

        int start = 0;
        int end = k;
        while(end < s.length()){

            if(isVowels(s.charAt(start))){
                count--;
            }
            start++;

            if(isVowels(s.charAt(end))){
                count++;
            }
            end++;

            maxcount = Math.max(maxcount, count);
        } 

        return maxcount; 
    }


    public boolean isVowels(char ch){
            return ch == 'a' || ch == 'e'|| ch == 'i'||ch == 'o'||ch == 'u';
        }
}