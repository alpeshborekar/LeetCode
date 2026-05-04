class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        int count = 0;

        for (String word : words) {

            boolean isValid = true;

            for (char ch : word.toCharArray()) {

                if (allowed.indexOf(ch) == -1) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) count++;
        }

        return count;
    }
}