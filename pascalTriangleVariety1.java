//IN PASCALS TRIANGLE
// Variation 1: Given row number r and column number c. Print the element at position (r, c) in Pascal’s triangle.

public class pascalTriangleVariety1 {
    public static void pascalusingCombination(int n,int r){
        long res=1;
        for(int i=0;i<r;i++){
        res=res*(n-i);
        res=res/(i+1);
        }
       System.out.println(res);
      }
    
    public static void main(String args[]){
        int r=5;
        int c=3;
       System.out.print("For rth row and cth column the value from the pascals triangle is  "); 
        pascalusingCombination(r-1, c-1);
      }
    }

