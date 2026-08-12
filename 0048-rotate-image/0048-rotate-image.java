class Solution {
    public void rotate(int[][] matrix) {

        int n = matrix.length;

        for (int i = 0; i < (n + 1) / 2; i++) {

            for (int j = 0; j < n / 2; j++) {

                // Save bottom-left
                int temp = matrix[n - 1 - j][i];

                // Bottom-right → bottom-left
                matrix[n - 1 - j][i] =
                    matrix[n - 1 - i][n - j - 1];

                // Top-right → bottom-right
                matrix[n - 1 - i][n - j - 1] =
                    matrix[j][n - 1 - i];

                // Top-left → top-right
                matrix[j][n - 1 - i] =
                    matrix[i][j];

                // Bottom-left → top-left
                matrix[i][j] = temp;
            }
        }
    }
}