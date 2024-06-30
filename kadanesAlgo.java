//Kadane’s Algorithm : Maximum Subarray Sum in an Array
// brute force approach
//Time Complexity: O(N3), where N = size of the array.
//Reason: We are using three nested loops, each running approximately N times.
//Space Complexity: O(1) as we are not using any extra space.
/* 
public class kadanesAlgo {
    public static int maxSubArraySum(int arr[],int n){
     
           int max=0;
             for(int i=0;i<n;i++){
                for(int j=i;j<n;j++){
                      int sum=0;
                    for(int k=i;k<=j;k++){
                        sum=sum+arr[k];
                    
                         max=Math.max(max, sum);

                    }
                }
                
                }
                return max;
             }
         
    
    public static void main(String args[]){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
       int ans= maxSubArraySum(arr, n);
       System.out.println(ans);
    }
    
}    */


// BETTER APPROACH
//Time Complexity: O(N2), where N = size of the array.
//Reason: We are using two nested loops, each running approximately N times.

//Space Complexity: O(1) as we are not using any extra space.
/* 
public class kadanesAlgo {
    public static int maxSubArraySum(int arr[],int n){
     
           int max=0;
             for(int i=0;i<n;i++){
                  int sum=0;       // try to keep  this one loop before use always ..o/p wont come correct otherwise
                for(int j=i;j<n;j++){
                
                        sum=sum+arr[j];
                    
                         max=Math.max(max, sum);

                    
                }
                
                }
                return max;
             }
         
    
    public static void main(String args[]){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
       int ans= maxSubArraySum(arr, n);
       System.out.println(ans);
    }
}  
  */



//optimal approach
//T.C O(N)
//S.C =O(1)

public class kadanesAlgo {
    public static int maxSubArraySum(int arr[],int n){
           
           int max=Integer.MIN_VALUE; //// initalising with this as array has negative elements so here it will be assigned to least value 
           int sum=0;

             for(int i=0;i<n;i++){
                    sum=sum+arr[i];
                    
                    if(sum>max)
                     max=sum;

                    if(sum<0)
                    sum=0;
                
                
                }
                return max;
             }
         
    
    public static void main(String args[]){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
       int ans= maxSubArraySum(arr, n);
       System.out.println(ans);
    }
}       

// to print value of subarray but not understood code 
/* 
public class kadanesAlgo {
    public static int maxSubArraySum(int arr[],int n){
           int ansStart=-1;
           int ansEnd=-1;
           int start=0;
           int max=Integer.MIN_VALUE;
           int sum=0;

             for(int i=0;i<n;i++){

                if(sum==0)
                    start=i;

                    sum=sum+arr[i];
                    
                    if(sum>max)
                     max=sum;

                    if(sum<0)
                    sum=0;
                
                    
                    ansStart=start;
                    ansEnd=i;
                
                }
                System.out.println("The numbers are ");
                for(int m=ansStart;m<ansEnd;m++){
                        System.out.print( arr[m]+" ");

                    }
                return max;
             }
         
    
    public static void main(String args[]){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
       int ans= maxSubArraySum(arr, n);
       System.out.println(" ");
       System.out.println("sum is " +ans);
    }
}     */
