//IN PASCAL TRIANGLE
//Given the row number n. Print the n-th row of Pascal’s triangle.
//OPTIMAL SOLUTION

//T.C=O(N)
//S.C=O(1)


public class pascalTriangleVariety2 {
    public static void printNthRow(int row){
        int ans=1;
        System.out.print(1+" ");
        for(int i=1;i<row;i++){    // i is the col..traversing each col through i  till nth row
         ans=ans*(row-i);
         ans=ans/i;
        
     System.out.print(ans+" ");
    }
    }

    public static void main(String args[]){
        int row=5;
       System.out.println("Printing the given whole row in pascal triangle");
         printNthRow(row);
    }
}


// brute force approach
// Time Complexity: O(n*r), where n is the given row number, and r is the column index which can vary from 0 to n-1.
//Reason: We are calculating the element for each column. Now, there are total n columns, and for each column, the calculation of the element takes O(r) time where r is the column index.
//Space Complexity: O(1) as we are not using any extra space

/* 
public class pascalTriangleVariety2 {
    public static void printNthRow(int row){
        for(int c=1;c<=row;c++){
            combination(row-1,c-1);
        }
       
    }
    public static void combination(int n,int r){
        int ans=1;
        for(int i=0;i<r;i++){
        ans=ans*(n-i);
        ans=ans/(i+1);
        }
        System.out.print(ans+" ");
    }

    public static void main(String args[]){
        int row=5;
       System.out.println("Printing the given whole row in pascal triangle");
         printNthRow(row);
    }
}

*/