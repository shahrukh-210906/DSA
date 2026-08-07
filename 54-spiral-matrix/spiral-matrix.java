class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int sr = 0;
        int er = n-1;
        int sc = 0;
        int ec = m-1;

        List<Integer> output = new ArrayList<>();



        while (sc<=ec && sr<=er){
            for (int j = sc; j<=ec; j++){
                output.add(matrix[sr][j]);
            }
            
            for(int i = sr+1; i<=er; i++){
                output.add(matrix[i][ec]);
            }

            for(int j = ec-1; j>=sc; j--){
                if (sr == er){
                    break;
                }
                output.add(matrix[er][j]);

            }

            for (int i = er-1; i>=sr+1; i--){
                if (sc == ec){
                    break;
                }
                output.add(matrix[i][sc]);

            }

            sr++;
            sc++;
            er--;
            ec--;
        }

        return output;
        
    }
}