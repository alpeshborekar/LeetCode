class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> unique = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j] && !unique.contains(nums1[i])) {
                    unique.add(nums1[i]);
                }
            }
        }

        // Convert ArrayList to int[]
        int[] result = new int[unique.size()];

        for (int i = 0; i < unique.size(); i++) {
            result[i] = unique.get(i);
        }

        return result;
    }
}
