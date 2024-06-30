//Count Maximum Consecutive One’s in the binary array. rest digit is 0
//only one approach given
//T.C=O(n)
//S.C=O(1)

public class MaxConsecONES {
    public static void maxCons(int arr[],int n){
         int c=0;
         int maxc=0;
        for(int i=0;i<n;i++){
          
            if(arr[i]==1){
                c++;
            }
            else{
                c=0;
                }
        maxc=Math.max(maxc, c);
    }
        System.out.println("maximum no of ones is "+maxc);
    }
   public static void main(String args[]){
    int arr[]={1,1,0,1,1,1,0,1};
    int n=8;
    maxCons(arr, n);

   } 
}

// // optimal approach 
// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//        int res=0;
//        int maximum=0;
//        for(int i=0;i<nums.length;i++){
//         if(nums[i]==1){
//             res++;
//         }
//         else{
//             res=0;
//         }
//        maximum=Math.max(maximum,res); // imp to put inside the loop to keep updating everytime
//        } 
    
//        return maximum;
//     }
// }