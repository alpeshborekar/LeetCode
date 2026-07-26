class Solution {
    public int characterReplacement(String s, int k) {

        int[] freq = new int[26];
        int left = 0;
        int maxfreq = 0;
        int maxwindo = 0;

        for(int right = 0 ; right < s.length(); right++){

            freq[s.charAt(right) - 'A']++;

            maxfreq = Math.max(maxfreq, freq[s.charAt(right) - 'A']);

            int windolength = right - left + 1;

            if(windolength - maxfreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            windolength = right -left + 1;
            maxwindo = Math.max(maxwindo , windolength);


        }

        return maxwindo;
    }
}