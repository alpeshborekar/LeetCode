class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                int current = matrix[i][j];

                boolean isRowMin = true;
                boolean isColMax = true;

                // Check row
                for (int col = 0; col < cols; col++) {
                    if (matrix[i][col] < current) {
                        isRowMin = false;
                        break;
                    }
                }

                // Check column
                for (int row = 0; row < rows; row++) {
                    if (matrix[row][j] > current) {
                        isColMax = false;
                        break;
                    }
                }

                if (isRowMin && isColMax) {
                    list.add(current);
                }
            }
        }

        return list;
    }
}