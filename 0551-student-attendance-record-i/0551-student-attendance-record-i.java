class Solution {
    public boolean checkRecord(String s) {

        int countA = 0;
        int countL = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // check A
            if (ch == 'A') {
                countA++;
                if (countA >= 2) return false; 
            }

            
            if (ch == 'L') {
                countL++;
                if (countL >= 3) return false;
            } else {
                countL = 0;
            }
        }

        return true;
    }
}