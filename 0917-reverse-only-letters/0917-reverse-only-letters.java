class Solution {
    public String reverseOnlyLetters(String s) {

        char[] chArr = s.toCharArray();

        int left = 0;
        int right = chArr.length - 1 ; 

        while(left < right){

            if(!Character.isLetter(chArr[left])){
                left++;
            }else if(!Character.isLetter(chArr[right])){
                right--;
            }else{
                char temp = chArr[left];
                chArr[left] = chArr[right];
                chArr[right] = temp;

                right--;
                left++;
            }
        }
        return new String(chArr);
    }
}