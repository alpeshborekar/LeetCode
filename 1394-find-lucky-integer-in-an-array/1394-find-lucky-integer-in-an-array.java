import java.util.HashMap;

class Solution {
    public int findLucky(int[] arr) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int num : arr) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int ans = -1;

        for (int key : mp.keySet()) {
            if (key == mp.get(key)) {
                ans = Math.max(ans, key);
            }
        }

        return ans;
    }
}