//Left Rotate the Array by One
/* 
// brute force approach
// T.C=(N)   ITERATE ARRAY ONCE
//S.C=O(N)   SIZE OF ANOTHER ARRAY TEMP
public class RORone {
     public static void rotate(int arr[],int n){
      int temp[]=new int[n];

          for(int i=0;i<n;i++){
            temp[i]=arr[i+1];
          }
          temp[n-1]=arr[0];

          System.out.println("rotated array at one place");
     for(int i=0;i<n;i++){

        System.out.print(temp[i]+",");
     }
    }
     public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int n=6;
        rotate(arr, n);
     }
}
         */

// OPTIMAL SOLUTION

//T.C=O(N)  ITERATE ARRAY ONLY ONCE
//S.C=O(1)
// public class RORone {
//      public static void rotate(int arr[],int n){
      
//          int temp=arr[0];
//           for(int i=1;i<n;i++){
//             arr[i-1]=arr[i];       
//           }
//           arr[n-1]=temp;

//           System.out.println("rotated array at one place");
//           for(int i=0;i<n;i++){
//           System.out.print(arr[i]+" ");
//      }
//     }
//      public static void main(String args[]){
//         int arr[]={1,2,3,4,5,6};
//         int n=6;
//         rotate(arr, n);
//      }
//     }


// coding ninja
// import java.util.* ;
// import java.io.*; 
// public class Solution {

//     static int[] rotateArray(int[] arr, int n) {
//          int temp=arr[0];
//          for(int i=1;i<n;i++){
//            arr[i-1]=arr[i];
//          }
//          arr[n-1]=temp;
//      return arr;
//     }
// }

