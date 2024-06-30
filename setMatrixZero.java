//Set Matrix Zero
//Problem Statement: Given a matrix if an element in the matrix is 0 then you will have to set its entire column and row to 0 and then return the matrix

//brute force approach
//Time Complexity: O((N*M)*(N + M)) + O(N*M), where N = no. of rows in the matrix and M = no. of columns in the matrix.
//Space Complexity: O(1) as we are not using any extra space.
/* 
//NOT WORKING CORRECTLY
public  class setMatrixZero {
 public static void zero(int[][]matrix,int row,int col ){
         row=matrix.length;
         col=matrix[0].length;
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0)
               
                markrow(matrix,row,col,j);
                markcol(matrix,row,col,i);
            }
         }
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==-1)
                matrix[i][j]=2;
            }
         }  
    }
    public static void markcol(int matrix[][],int row,int col,int i){
        for(int j=0;j<col;j++){
          if(matrix[i][j]!=0)
             matrix[i][0]=-1;
        }
    }
    public static void markrow(int matrix[][],int row,int col,int j){
        for(int i=0;i<row;i++){
            if(matrix[i][j]!=0)
           matrix[0][j]=-1;      
          }
    }
    public static void main(String args[]){
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        int col=matrix[0].length;
        int row=matrix.length;
        zero(matrix,row,col);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
            System.out.print(matrix[i][j]+" ");
            System.out.println(" ");
        }
        System.out.println("  ");
       
    }
   }           */

// optimal
//Time Complexity: O(2*(N*M)), 
//Space Complexity: O(N) + O(M),


public  class setMatrixZero {
 public static void zero(int[][]matrix,int n,int m ){
        int row[]=new int[n];
        int column[]=new int[m];
        

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0)
                row[i]=1;
                column[j]=1;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(row[i]==1||column[j]==1)
                
                matrix[i][j]=0;

            }
        }
       
    }
    public static void main(String args[]){
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };
        int m=matrix[0].length;
        int n=matrix.length;
        zero(matrix,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
            System.out.print(matrix[i][j]+" ");
            System.out.println(" ");
        }
        System.out.println("  ");
       
    }
   }           
