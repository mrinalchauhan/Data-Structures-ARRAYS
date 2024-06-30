//leetcode ->rotate matrix by 90 degree
public class rotateMatrixBy90degree {
    
        public void rotate(int[][] matrix) {
            int n=matrix.length;
            int rotated[][]=new int[n][n];
            
            for(int i=0;i<n;i++){
               for(int j=0;j<n;j++){
                rotated[j][n-i-1]=matrix[i][j];
               }
            }
            // putting values in matrix back
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j]=rotated[i][j];
                }
            }
        }
    }

