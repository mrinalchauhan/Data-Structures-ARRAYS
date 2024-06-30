//length of the sequence which contains the consecutive elements
// optimal -> leetcode
import java.util.*;
class longestConsecSeq {
    public static int longest(int[] nums) {
        int maxcount=1;
        int n=nums.length;
        if(n==0){
            return 0;
        }
        Arrays.sort(nums);
        int c=1;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){ // to avoid duplicates
                if(nums[i]==nums[i-1]+1){
                    c++; 
                }
                else{
                maxcount=Math.max(maxcount,c);
                c=1;
                }
               
            }
            
        }
        return Math.max(maxcount,c);
    }
    public static void main(String args[]){
        int arr[]={100,200,1,3,2,4};
       int ans= longest(arr);
        System.out.println(ans);
        
    }
}
//length of the sequence which contains the consecutive elements.
//brute force approach
//T.C=O(n^n)
// S.C=O(1)

/* 
public class longestConsecSeq {
    public static int longest(int arr[],int n){
        int c=1;
     for(int i=0;i<=n-1;i++){
       if(linearSearch(arr, arr[i]+1)==true)   
           c++;
     }
     return c;
    }
    public static boolean linearSearch(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num)
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={100,200,1,3,2,4};
        int n =arr.length;
      int ans= longest(arr,n);
        System.out.println(ans);
        
    }
    
}
     */


//length of the longest sequence which contains the consecutive elements
//BRUTE FORCE APPROAACH
//T.C=O(N^N)
//S.C=O(1)
/* 
public class longestConsecSeq {
    public static int longest(int arr[],int n){
     int l=0;
     for(int i=0;i<=n-1;i++){
       int x=arr[i]; 
       int c=1;
       while(linearSearch(arr, x+1)==true){ 
            x=x+1;   //imp line  BUT WHAT IS THE IMPORTANCE OF THIS LINE
             c++;
       }
           l=Math.max(l,c);
     }
     return l;
    }
    public static boolean linearSearch(int arr[],int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num)
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={100,200,1,3,2,4,101,102,104,103};
        int n =arr.length;
      int ans= longest(arr,n);
        System.out.println(ans);
        
    }
    
}           */


//BETTER APPROACH
//Time Complexity: O(NlogN) + O(N), N = size of the given array.
//Reason: O(NlogN) for sorting the array. To find the longest sequence, we are using a loop that results in O(N).

//Space Complexity: O(1), as we are not using any extra space to solve
/* 

import java.util.Arrays;
public class longestConsecSeq {
    public static void longest(int arr[],int n){
        int lst=0;
        int c=1;
        int maxlong=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
          if(arr[i]-1==lst){
          c++;
          lst=arr[i];

        }
        else if(arr[i]!=lst){
            c=1;
            lst=arr[i];
        }
        maxlong=Math.max(maxlong,c);
    }
    System.out.println(maxlong);
}
    public static void main(String args[]){
        int arr[]={100,200,1,3,2,4,101,102,104,103};
        int n =arr.length;
       longest(arr,n);
        
    }
    
}
        */
//optimal approach
// same as brute force only diff is that here we use hashset
//Time Complexity: O(N) + O(2*N) ~ O(3*N), where N = size of the array.
//Reason: O(N) for putting all the elements into the set data structure. After that for every starting element, we are finding the consecutive elements. Though we are using nested loops, the set will be traversed at most twice in the worst case. So, the time complexity is O(2*N) instead of O(N2).

//Space Complexity: O(N), as we are using the set data structure to solve this problem.


// import java.util.HashSet;

// public class longestConsecSeq {
//     public static void longest(int arr[],int n){
//     HashSet<Integer>hash=new HashSet<>();
//     int c=1;
//     int ll=0;
//     for(int i=0;i<n;i++){
//         hash.add(arr[i]);
//         int x=arr[i];
    
//    if(hash.contains(arr[i]+1)){
//     x=x+1;
//     c++;
   
//    }
  
//     ll=Math.max(ll,c);
// }
//     System.out.println(ll);

// }
//     public static void main(String args[]){
//         int arr[]={100,200,1,1,3,2,102,3,2,4,101,102,104,103};
//         int n =arr.length;
//        longest(arr,n);
        
//     }
// }
     