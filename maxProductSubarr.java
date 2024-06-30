//Maximum Product Subarray in an Array
//brute force approach
//Time Complexity: O(N^3)
//Reason: We are using 3 nested loops for finding all possible subarrays and their product.

//Space Complexity: O(1)
//Reason: No extra data structure was used

/*
public class maxProductSubarr {
    public static int maxpdt(int arr[],int n){
        int max=0;
       for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            int pdt=1;
            for(int k=i;k<=j;k++){
                pdt=pdt*arr[k];
             max=Math.max(max,pdt);
            }
        }
       }
       return max;
    }
    public static void main(String args[]){

    int arr[]={1,2,-3,0,-4,-5};
    int n=arr.length;
    int ans=maxpdt(arr, n);
    System.out.println("Maximum product subarray is "+ans);

}    
}
   */

//BETTER APPROACH
//Time Complexity: O(N^2)
//Reason: We are using two nested loops

//Space Complexity: O(1)
//Reason: No extra data structures are used for computation
   
/* 
public class maxProductSubarr {
    public static int maxpdt(int arr[],int n){
        int max=0;
       for(int i=0;i<n;i++){
           int pdt=1;
        for(int j=i;j<n;j++){
         
        
                pdt=pdt*arr[j];
             max=Math.max(max,pdt);
            }
        }
       
       return max;
    }
    public static void main(String args[]){

    int arr[]={1,2,-3,0,-4,-5};
    int n=arr.length;
    int ans=maxpdt(arr, n);
    System.out.println("Maximum product subarray is "+ans);

}    
}
    */


//OPTIMAL
//Time Complexity: O(N), N = size of the given array.
//Reason: We are using a single loop that runs for N times.

//Space Complexity: O(1) as No extra data structures are used for computation.
   
public class maxProductSubarr {
    public static int maxpdt(int arr[],int n){
        int pre=1;
        int suff=1;
       
        int maxm=0;
      for(int i=0;i<n;i++){
         int max=0;

        if(pre==0){
        pre=1;
        }

        if(suff==0){
        suff=1;
        }

        pre=pre*arr[i];
        suff=suff*arr[n-i-1];
        max=Math.max(pre,suff);
        maxm=Math.max(maxm,max);
        
      }
      return maxm;
    }
    public static void main(String args[]){

    int arr[]={1,2,-3,0,-4,-5};
    int n=arr.length;
    int ans=maxpdt(arr, n);
    System.out.println("Maximum product subarray is "+ans);

}    
}


   