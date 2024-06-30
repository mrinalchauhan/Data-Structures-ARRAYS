//Count the number of subarrays with given xor K
//Problem Statement: Given an array of integers A and an integer B. Find the total number of subarrays having bitwise XOR of all elements equal to k.
//brute force approach
//Time Complexity: O(N^3) approx., where N = size of the array.
//Reason: We are using three nested loops, each running approximately N times.

//Space Complexity: O(1) as we are not using any extra space.

/*
public class countSubarrayWithGivenXOR {
     public static int count(int arr[],int tar){
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int xor=0;
                for(int k=i;k<=j;k++){
                    xor=xor^arr[k];    
                }
                 if(xor==tar){
                        c++;
                    }
            }
        }
   return c;

     }
     public static void main(String args[]){
       int arr[]={ 4, 2, 2, 6, 4};
       int tar=6;
       int ans=count(arr,tar);

       System.out.println("The number of subarrays with XOR k is: " + ans);
     }
}
    */
//BETTER APPROACH

//Time Complexity: O(N^2), where N = size of the array.
//Reason: We are using two nested loops here. As each of them is running for N times, the time complexity will be approximately O(N2).

//Space Complexity: O(1) as we are not using any extra space.
    public class countSubarrayWithGivenXOR {
     public static int count(int arr[],int tar){
        int n=arr.length;
        int c=0;
        for(int i=0;i<n;i++){
                 int xor=0;
            for(int j=i;j<n;j++){
           
                    xor=xor^arr[j];   
                     if(xor==tar){
                        c++;
                    } 
                }
                
            }
        
   return c;

     }
     public static void main(String args[]){
       int arr[]={ 4, 2, 2, 6, 4};
       int tar=6;
       int ans=count(arr,tar);

       System.out.println("The number of subarrays with XOR k is: " + ans);
     }
}

//optimal app
//hashmap not done