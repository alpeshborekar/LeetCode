class Solution {
    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();

        String[] arr = s.split(" ");
        for(int i = 0 ;i < arr.length ;i++){
            char[] ch = arr[i].toCharArray();
            int j = 0;
            int n = ch.length-1;
            while(j < n - j){
                char temp = ch[j];
                ch[j] = ch[n-j];
                ch[n-j] = temp;
                j++;
            }
            String S = new String(ch);
            sb.append(S);
            if(i != arr.length-1){
                sb.append(' ');
            }

        }
    return sb.toString();

        
    }
}