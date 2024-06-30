// print pascals triangle
// brute force approach
//Time Complexity: O(n*n*r) ~ O(n3), where n = number of rows, and r = column index.
//Reason: The row loop will run for approximately n times. And generating a row using the naive approach of variation 2 takes O(n*r) time complexity.

//Space Complexity: In this case, we are only using space to store the answer. That is why space complexity can be still considered as O(1).


/*
public class pascalTrianglePRINTvariety3 {
    public static void pascal(int n){
       for(int row=1;row<=n;row++){
        for(int col=1;col<=row;col++){ 
            combination(row-1, col-1);
            System.out.print(" ");
        }
        System.out.println(" ");
       }  
    }
    public static void combination(int row,int col){
        int ans=1;
       for(int i=0;i<col;i++){
        ans=ans*(row-i);
        ans=ans/(i+1);
       }
       System.out.print(ans+" ");
    }
    public static void main(String args[]){
      int n=5;
      System.out.println("PASCAL'S TRIANGLE");
      pascal(n);
    }
}
  */

//OPTIMAL SOLUTION
//Time Complexity: O(n*n), where n = number of rows(given).
//Reason: We are generating a row for each single row. The number of rows is n. And generating an entire row takes O(n) time complexity.

//Space Complexity: In this case, we are only using space to store the answer. That is why space complexity can still be considered as O(1).

public class pascalTrianglePRINTvariety3 {
    public static void pascal(int n){
       for(int r=1;r<=n;r++){
        
            combination(r);
            System.out.println(" ");
            
        }
    }
    public static void combination(int row){
        int ans=1;
        System.out.print(1+" ");
        for(int col=1;col<row;col++){
          ans=ans*(row-col);
          ans=ans/col;
          System.out.print(ans+" ");
          
        }
  
    }
    
    public static void main(String args[]){
      int n=5;
      System.out.println("PASCAL'S TRIANGLE");
      pascal(n);
    }
}

