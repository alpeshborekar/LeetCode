class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for (int freq : mp.values()) {

            if (set.contains(freq)) {
                return false;
            }

            set.add(freq);
        }

        return true;
    }
}