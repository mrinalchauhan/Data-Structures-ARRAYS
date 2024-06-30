
//Find Second Smallest and Second Largest Element in an array


// coding ninja
public class secondSmallLARGEele {
    public static int slargest(int a[]){
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                
                secmax=max;
                 max=a[i];
                 
            }
            if(a[i]>=secmax && a[i]<max){
                secmax=a[i];
            }
        }
        return secmax;
    }

    public static int ssmallest(int a[]){
       int small=Integer.MAX_VALUE;
        int secsmall=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(small>a[i]){
                secsmall=small;      //1  // order imp
                small=a[i];          //2
            }
            if(a[i]<=secsmall && a[i]>small){
                secsmall=a[i];
            }
        }
        return secsmall;
    }
    public static int[] getSecondOrderElements(int n, int []a) {
        int l=slargest(a);
        int s=ssmallest(a);
        int ans[]={l,s};
        return ans;
    }
   
}

// geekforgeeks

// import java.io.*;
// import java.util.*;
// import java.util.stream.Collectors;
// class Solution {
//     int print2largest(int arr[], int n) {
 
//     boolean flag=false;
//     int max=arr[0];
//     int secmax=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             if(arr[i]>max &&secmax<max){
//                 secmax=max;
//                 max=arr[i];
//             }
//             //to traverse whole array
//             if(arr[i]>=secmax && arr[i]!=max){
//                 secmax=arr[i];
                
//             } 
//         }
        
//         if(secmax==Integer.MIN_VALUE){ // if all elements are same
//                 return -1;
//             }
        
//       return secmax;
//     }
// }

/* 
// Time Complexity: O(NlogN), For sorting the array

//Space Complexity: O(1)

import java.util.*;
public class secondSmallLARGEele {
    public static void element(int arr[],int n){
     Arrays.sort(arr);
     int secSMALL=arr[1];
     int secLARGE=arr[n-2];
     System.out.println("second largest element "+secSMALL);
     System.out.println("second Largest element "+secLARGE);
    }
    public static void main(String args[]){
        int arr[]={2,5,1,4,6};
        int n=arr.length;
        element(arr, n);
    }
}                 */
  
// OPTIMAL approach
// Time Complexity: O(N), Single-pass solution
// Space Complexity: O(1)

// public class secondSmallLARGEele{
//     public static void secSmall(int arr[],int n){
//         int small=arr[0];
//         int secSmall=Integer.MAX_VALUE;
//         for(int i=0;i<n;i++){
//             if(arr[i]<small){
//                 secSmall=small;     // imp line
//                 small=arr[i];
//             }
//            if(arr[i]!=small && arr[i]<secSmall){
//                secSmall=arr[i];
//             }
//         } 
//  System.out.println("smallest element "+small);
//   System.out.println("second smallest element "+secSmall);
//         }
// public static void secLarge(int arr[],int n){
//    int large=arr[0];
//    int secL=Integer.MIN_VALUE;
//    int i;
// for(i=0;i<n;i++){
//     if(arr[i]>large){
//         secL=large;      //imp line
//         large=arr[i];
        
//     }
//    if(arr[i]!=large&& arr[i]>secL){
//    secL=arr[i];
// }
// }
// System.out.println("largest element "+large);
// System.out.println("second largest "+secL);
// }
// public static void main(String args[]){
//         int arr[]={2,5,1,4,6};
//         int n=arr.length;
//         secSmall(arr, n);
//         secLarge(arr, n);
// }

// }

