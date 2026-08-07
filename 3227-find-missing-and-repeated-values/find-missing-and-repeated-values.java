class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeated = 0;
        int missing = 0;

        int n = grid.length;

        int temp[] = new int[(n*n)+1];

        for (int i =0; i<n; i++){
            for (int j =0; j<n; j++){
                temp[grid[i][j]]++;
            }
        }

        for (int i = 1; i<temp.length; i++){
            if (temp[i] > 1){
                repeated = i;
            }
            if (temp[i] == 0 ){
                missing = i;
            }
        }
        

        int output[] = {repeated, missing};
        return output;
    }
}