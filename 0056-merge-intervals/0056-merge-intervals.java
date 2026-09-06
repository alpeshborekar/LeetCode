class Solution {
    public int[][] merge(int[][] intervals) {

        // Step 1: Sort intervals by starting point
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();

        // Step 2: Start with the first interval
        int start = intervals[0][0];
        int end = intervals[0][1];

        // Step 3: Check every remaining interval
        for (int i = 1; i < intervals.length; i++) {

            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            // They overlap
            if (nextStart <= end) {
                end = Math.max(end, nextEnd);
            }

            // They don't overlap
            else {
                result.add(new int[]{start, end});

                start = nextStart;
                end = nextEnd;
            }
        }

        // Add the last interval
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }
}