// check whether array is sorted or not
// brute force approach
// T.C=o(n^2)
// S.C=O(1)
/* public class sortedArray {
    public static boolean sorted(int arr[],int n){
      for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
               return false;
            }

        }
      }
      return true;
    }
    public static void main(String args[]){
        int arr[]={2,5,1,6,4};
        int n=arr.length;
      System.out.println(sorted(arr,n));

    }
}    */

// optimal solution
// T.C=O(N)   SINGLE TRAVERSAL
//S.C=O(1)
public class sortedArray {
    public static boolean sorted(int arr[],int n){
      for(int i=0;i<arr.length;i++){
    
            if(arr[i]>arr[i+1]){
               return false;
            }

        }
      
      return true;
    }
    public static void main(String args[]){
        int arr[]={2,5,1,6,4};
        int n=arr.length;
      System.out.println(sorted(arr,n));

    }
}

// coding ninja
// public class Solution {
//     public static int isSorted(int n, int []a) {
//         for(int i=0;i<a.length-1;i++){
//             if(a[i]<a[i+1]){
//              return 1;
//             }
//         }
//         return 0;
//     }
// }