class Solution {
    public boolean checkRecord(String s) {


        int countA = 0 ;
        boolean isconsecutive = false ;


        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'A'){
                countA++;
            }
            if(i < s.length() - 2 ){
            if(s.charAt(i) == 'L' && s.charAt(i+1) == 'L' && s.charAt(i+2) == 'L'){
                isconsecutive = true;
            }
            }
        }
        if(countA < 2 && isconsecutive == false){
            return true;
        }

        return false;




        
    }
}