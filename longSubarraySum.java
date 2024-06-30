//Longest Subarray with given Sum K(Positives)
// brute force 
//t.c=o(n^n^n)
//s.c=o(1)
/* 
public class longSubarraySum {
        public static void longest(int arr[],int TargetSum){
            int n=arr.length;
              int maxm=0;
              for(int i=0;i<n;i++){
                 
                for(int j=0;j<n;j++){

                        int s=0;
                    for(int k=i;k<j;k++)  // for(int k=i;k<=j;k++)
                    {
                       s=s+arr[k];
                    }
                    if(s==TargetSum){
                        int len=j-i;       // len=j-i+1;
                        maxm=Math.max(maxm, len);

                    }
                }
                }
                   System.out.println(maxm);
            }
        

        public static void main(String args[]){
            int arr[]={2,3,5,1,9};
            int TargetSum=10;
            longest(arr, TargetSum);
        }
}
    */

    // BETTER APPROACH
    // T.C=O(n^n)
    //s.c=O(1)
/* 

public class longSubarraySum {
        public static void longest(int arr[],int TargetSum){
            int n=arr.length;
              int maxm=0;
              for(int i=0;i<n;i++){
                  int s=0;
                for(int j=i;j<n;j++){
                     s=s+arr[j];  
                    if(s==TargetSum){
                        int len=j-i+1;      
                        maxm=Math.max(maxm, len);

                    }
                }
                }
                   System.out.println(maxm);
             }
        public static void main(String args[]){
            int arr[]={2,3,5,1,9};
            int TargetSum=10;
            longest(arr, TargetSum);
        }
}   */

// optimal approach TWO POINTER APPROACH
// T.C=O(2N)
// S.C=O(1)
public class longSubarraySum {
        public static void longest(int arr[],int TargetSum){
            int n=arr.length;
             int left=0;
             int right=0;
             int s=arr[0];
             int maxlen=0;
             
        while(right<n && s<TargetSum){
              
               right++;
               if(right<n){
               s=s+arr[right];
               }
                while(left<=right ){
                    left++;
                    s=s-arr[left];
             }
               if(s==TargetSum){
                int len=right-left+1;
                maxlen=Math.max(len,maxlen);
               }
             }
             System.out.println(maxlen + " is the longest subarray whose sum is equal to TargetSum");
            }
        public static void main(String args[]){
            int arr[]={2,3,5,1,9,1,1,7,1};
            int TargetSum=10;
            longest(arr, TargetSum);
        }
}   

// leetcode
// class Solution {
//     public int subarraySum(int[] nums, int k) {
    
//         int c=0;
//         for(int i=0;i<nums.length;i++){
//                 int sum=0;
//             for(int j=i;j<nums.length;j++){
              
//                 sum=sum+nums[j];
            
//                 if(sum==k){
//                    c++;
//             }
//         }
//       }
//         return c;
//     }
// }


