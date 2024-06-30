//FIND THE ONCE OCCURED DIGIT
// brute force approach
// T.C=O(N^N)
//S.C=O(1)

public class noAppearOnes {
      public static void appearOnes(int arr[],int n){
           // int c=0;  do not write this here ...nae  run krega . write this under for loop
            
    for(int i=0;i<n;i++){
            int c=0;
            int num=arr[i];

           for(int j=0;j<n;j++){
            if(num==arr[j]){
               c++;
            }
           }
        
           if(c==1){
            System.out.println(num+" is the once occured number");
           }
        }
}
      public static void main(String args[]){
        int arr[]={1,2,1,4,3,4,2};
        int n=7;
        appearOnes(arr, n);
      }
}

// optimal approach using  xor
// class Solution {
//       public int singleNumber(int[] nums) {
//           int xor=0;
//           for(int i=0;i<nums.length;i++){
//               xor=xor^nums[i];
//           }
//           return xor;
//       }
//   }
 