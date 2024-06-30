//Two Sum : Check if a pair with given sum exists in Array
// brute force approach
//T.C=O(n^n)
//S.C=O(1)
/* 
public class twoSum {
    public static int pair(int arr[],int target){
             int n=arr.length; 
               
             for(int i=0;i<=n-1;i++){
                for(int j=i+1;j<n;j++){
                
                    if(arr[i]+arr[j]==target){
                      return 1;    // exists
                     
                } 
                }
            }
         return -1;    // does not exists
            }
    public static void main(String args[]){
        int arr[]={2,6,5,8,11};
        int target=17;
    int ans=pair(arr,target);
    System.out.println(ans);

        
    }
    
}   */


// brute force approach    FINDS THE VALUE ALSO
//T.C=O(n^n)
//S.C=O(1)
 /*
public class twoSum {
    public static int[] pair(int arr[],int target){
            int n=arr.length; 
            int ans[]=new int[2];
             for(int i=0;i<=n-1;i++){
                for(int j=i+1;j<n;j++){
                
                    if(arr[i]+arr[j]==target){
                        ans[0]=arr[i];
                        ans[1]=arr[j];
                     return ans;
                } 
                }
            }
         return ans;   
            }
    public static void main(String args[]){
        int arr[]={2,6,5,8,11};
        int target=17;
    int ans[]=pair(arr,target);
    System.out.println(ans[0] +" and "+ ans[1]);
    }
}   */
 
// optimal approach
// Time Complexity: O(N) + O(N*logN), where N = size of the array.
//Reason: The loop will run at most N times. And sorting the array will take N*logN time complexity.
//S.C=O(1)

// import java.util.Arrays;

// public class twoSum {
//     public static int pair(int arr[],int target){
//             int n=arr.length; 
//             int sum=0;
//             Arrays.sort(arr);
//             int left=0;
//             int right=n-1;
//     while(left<right){ 
//             sum=arr[left]+arr[right];
//             if(sum==target) {
//                 return 1;   //exists
//             }
//             else if(sum<target){
//                 left++;
//             }
//             else{
//                 right--;
//             }
//         }
//             return -1; // does not exists
//             }
//     public static void main(String args[]){
//         int arr[]={2,6,5,8,11};
//         int target=17;
//     int ans=pair(arr,target);
//     System.out.println(ans);
//     }
// }        