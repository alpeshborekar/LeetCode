class Solution {
    public String reverseVowels(String s) {

        

        char[] S  = s.toCharArray();

        int left = 0 ;
        int right = S.length -1;

        while(left < right){

            if(!isvowel(S[left])){
                left++;
            }else if(!isvowel(S[right])){
                right--;
            }else{
                char temp = S[left];
                S[left] = S[right];
                S[right] = temp;

                left++;
                right--;
            }
            


        } 
        return new String(S);
    }

    private boolean isvowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u' ||
        ch == 'A' || ch == 'O' ||ch == 'E' || ch == 'I' || ch == 'U';
    }
}