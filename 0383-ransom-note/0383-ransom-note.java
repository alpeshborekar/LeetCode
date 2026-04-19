class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        char[] arr1 = ransomNote.toCharArray();
        char[] arr2 = magazine.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                i++;
                j++;
            } else {
                j++; // skip extra 
            }
        }

        return i == arr1.length;
    }
}