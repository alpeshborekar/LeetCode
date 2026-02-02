class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == -1) {
                    int maxVal = Integer.MIN_VALUE;

                    // Scan the whole column j
                    for (int r = 0; r < m; r++) {
                        maxVal = Math.max(maxVal, matrix[r][j]);
                    }

                    matrix[i][j] = maxVal;
                }
            }
        }
        return matrix;
    }
}
