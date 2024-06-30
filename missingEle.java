// brute force approach    MISSING ELEMENT IN AN ARRAY 
//Time Complexity: O(N2), where N = size of the array+1.
//Space Complexity: O(1)  as we are not using any extra space.

// public class missingEle {
//     public static void missing(int arr[],int n){
//         for(int i=1;i<=n;i++){ 
//              int flag=0;     // agr if is not satisfied flag will be 0
//             for(int j=0;j<=n-2;j++)
//            {  
//                 if(arr[j]==i)
//                 flag=1;  
//             }
//         if(flag==0){
//             System.out.println(i);
//             }       
//      }       
//     //how to print no  missing element?  -> use return 0  and give function return type -> int
//         }   
//     public static void main(String args[]){
//         int arr[]={1,3,4,5};
//         int n=5;
//         missing(arr, n);
//     }   
// }       
/* 



// OPTIMAL APPROACH
//Time Complexity: O(N), where N = size of array+1.
//Reason: Here, we need only 1 loop to get the sum of the array elements. The loop runs for approx. N times. So, the time complexity is O(N).
//Space Complexity: O(1) as we are not using any extra space.
public class missingEle {
    public static void missing(int arr[],int n){
        int sum=(n*(n+1))/2;
        int s2=0;
        for(int i=0;i<n-1;i++){
          s2=s2+arr[i];
        }
       int missingN=sum-s2;
      System.out.println("Missing number "+missingN);
         }
    
    public static void main(String args[]){
        int arr[]={1,2,4,5};
        int n=5;
        missing(arr, n);
    }
}      */


// optimal 
import java.util.*;
public class missingEle {
    public static int missele(int arr[],int n){
        int sum=(n*(n+1))/2;
        int s2=0;
        int res=0;
        for(int i=0;i<n;i++){
        s2=s2+arr[i];

        if(s2 !=sum){
            res=sum-s2;
        }
        }
        return Math.abs(res);

    }
    public static void main(String args[]){
        int arr[]={1,2,4,5};
        int n=arr.length;
        int res=missele(arr,n);
        System.out.println(res);
    }
}

// // leetcode
// import java.util.*;
// class Solution {
//     public int missingNumber(int[] nums) {
//         Arrays.sort(nums);
//         int n=nums.length;
//         int i=0;
//         for(i=0;i<n;i++){
//             if(nums[i]!=i){
//                 return i;
//             }
//         }
//      return i;  // not i+1 as when i is not in list [0,1] result will be 2 and for loop increments its value before exiting loop
//     }
// }