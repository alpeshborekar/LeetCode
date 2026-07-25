class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        if(p.length() > s.length()){
            return new ArrayList<>();
        }

        int[] Pfreq = new int[26];
        int[] Sfreq = new int[26];

        List<Integer> list = new ArrayList<>();


        for(int i = 0 ; i < p.length();i++){

            Pfreq[p.charAt(i) - 'a']++;

            Sfreq[s.charAt(i) - 'a']++;
        }

        if(matches(Pfreq, Sfreq)){
            list.add(0);
        }

        for(int right = p.length() ; right < s.length() ; right++){

            Sfreq[s.charAt(right) - 'a']++;

            Sfreq[s.charAt(right - p.length()) - 'a']--;

            if(matches(Pfreq , Sfreq)){
                list.add(right - p.length() + 1);
            }
        }

        return list;


        
    }

    public boolean matches(int[] S ,int[] P){

        for(int i = 0 ; i < 26 ; i++){
            if(S[i] != P[i]){
                return false;
            }
        }
        return true;
    }
}