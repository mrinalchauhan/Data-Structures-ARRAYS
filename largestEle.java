
/* 
// find the largest element of the array
//  T.C=O(nlog n)
 // S.C=O(n)
import java.util.*;
public class largestEle {
  public static void largest(){
    int arr[]={2,5,1,4};
    int n=arr.length;
    Arrays.sort(arr);
    int ans =arr[n-1];
    System.out.println("the largest number in the array is "+ans);
  }  
  public static void main(String args[]){
    largest();
  }
}
*/

// optimal (recursive approach)
//Time Complexity: O(N)

//Space Complexity: O(1)

// class largestEle{
//     public static void largest(int arr[],int n){
//         int max=0;
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         System.out.println("largest element of the array is "+max);

//     }
//     public static void main(String args[]){
//         int arr[]={2,5,1,4};
//         int n=arr.length;
//         largest(arr,n);
//     }
// }
import java.util.*;
public class largestEle{
  public static void brute(int arr[]){
     Arrays.sort(arr);
     int ans=arr[arr.length-1];
     System.out.println("largest element is "+ans);
    }
    public static void optimal(int arr[]){
      int max=arr[0];
      for(int i=1;i<=arr.length-1;i++){     //range 
        if(arr[i]>max){
          max=arr[i];
        }
      }
      System.out.println("largest element is "+max);
    }
  
  public static void main(String args[]){
      int arr[]={2,4,1,3,8,4};
      brute(arr);
      optimal(arr);
  }
}