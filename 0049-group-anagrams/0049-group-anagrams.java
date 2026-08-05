class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0) return new ArrayList<>();

        HashMap<String , List<String>> map = new HashMap<>();


        for(String str : strs){

            String freqOfString = getFreqString(str);

            if(map.containsKey(freqOfString)){
                map.get(freqOfString).add(str);
            }
            else{
                List<String> strList = new ArrayList<>();  // value in a map stored as list
                strList.add(str);
                map.put(freqOfString , strList);
            } 
        }
        return new ArrayList<>(map.values());
}

       public String getFreqString(String str){

            int[] freq = new int[26];

            for(char c : str.toCharArray()){
                freq[c - 'a']++;
            }

            StringBuilder freqOfString = new StringBuilder("");
            char c = 'a';
            for(int num : freq){
                freqOfString.append(c);
                freqOfString.append(num);
                c++;
            }

            return freqOfString.toString();

        }        
    }
