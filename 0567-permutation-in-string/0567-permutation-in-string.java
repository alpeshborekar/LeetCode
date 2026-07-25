class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()){
            return false;
        }

        int[] freq = new int[26];
        int[] windofreq = new int[26];
        
        for(int i = 0; i < s1.length();i++){

            freq[s1.charAt(i) - 'a']++;

            windofreq[s2.charAt(i) - 'a']++;

        }
        if(matches(freq , windofreq)){
            return true;
        }

        for(int right = s1.length() ; right < s2.length() ; right++){

            windofreq[s2.charAt(right) - 'a']++;

            windofreq[s2.charAt(right - s1.length()) - 'a']--;


            if(matches(freq , windofreq)){
                return true;
            }
        }

        return false;


    
    }

    public boolean matches(int[] S1 , int[] S2){

        for(int i = 0 ;i < 26 ;i++){
            if(S1[i] != S2[i]){
                return false;
            }
        }
        return true;
    }
}