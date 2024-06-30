//Length of the longest subarray with zero Sum(both positive and negative element in array)
//brute force approach
//Time Complexity: O(N^2) as we have two loops for traversal
//Space Complexity: O(1) as we aren’t using any extra space

public class longSubarrSumToZero {
    public static int longest(int arr[],int n){
        int max=0;
     for(int i=0;i<n;i++){
        int sum=0;
        for(int j=i;j<n;j++){
             sum=sum+arr[j];
            if(sum==0){
                int len=j-i+1;
            max=Math.max(max,len);
            }
        }
     }
     return max;
    }
   public static void main(String args[]){
    int arr[]={9, -3, 3, -1, 6, -5};
    int n=arr.length;
    int ans=longest(arr,n);
    System.out.println("Longest subarray sum to zero is "+ans);

   } 

}
//OPTIMAL APP
// HASHMAP NOT DONE