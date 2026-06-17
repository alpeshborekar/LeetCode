class Solution {
    public String reverseWords(String s) {

        String[] arr = s.trim().split("\\s+");

        int n = arr.length;

        int i = 0;

        while(i < n / 2){
            String temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
            i++;
        }

        return String.join(" ", arr);
    }
}