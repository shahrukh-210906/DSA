class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length-1;
        boolean output = false;

        while(r < matrix.length && c >= 0){
            if (matrix[r][c] == target){
                output = true;
                break;
            } else if (matrix[r][c] > target){
                c--;
            } else if (matrix[r][c] < target){
                r++;
            }
        }

        return output;

    }
}