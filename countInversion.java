//Count inversions in an array
//What is an inversion of an array? Definition: for all i & j < size of array, if i < j then you have to find pair (A[i],A[j]) such that A[j] < A[i].
//brute fprce 
//T.C=O(n^2)
//S.c=O(1)
/* 
public class countInversion {
    public static int count(int arr[],int n){
        int c=0;
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    c++;
                }
                
            }
            
        }
       return c; 
    }
    public static void main(String args[]){
         int arr[]={5,4,3,2,1};
         int n=arr.length;
        int ans= count(arr,n);
        System.out.println("no of count inversion "+ans);
         
    }
    
}           */

//optimal approach
//Time Complexity: O(N*logN), where N = size of the given array.
//Reason: We are not changing the merge sort algorithm except by adding a variable to it. So, the time complexity is as same as the merge sort.

//Space Complexity: O(N), as in the merge sort We use a temporary array to store elements in sorted order.

import java.util.*;
public class countInversion{
    public static int merge(int arr[],int low,int mid,int high){
        int c=0;
        List<Integer>temp= new ArrayList<>();
         mid=(low+high)/2;
       int i=low;
       int j=mid+1;

       while(i<=low && j<=high){
        if(arr[i]<arr[j]){
            temp.add(arr[i]);
            i++;
        }
        else{
            temp.add(arr[j]);
            c=c+(mid-i+1);
            j++;
        }
    }
        while(i<mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<high){
            temp.add(arr[j]);
            j++;
        }
        for(int m=low;m<high;m++){
         arr[m]=temp.get(m-low);
        }
       
       return c;

    }
    public static int mergesort(int arr[],int low,int high){
        int c=0;
        if(low==high){
            return c;
        }
        int mid=(low+high)/2;
        c+= mergesort(arr,low,mid);
        c+= mergesort(arr,mid+1,high);
        c+= merge(arr,low, mid, high);
        
        return c;
    }
    public static int numberOfInversions(int arr[],int n){
       int c= mergesort(arr, 0, n-1);
       return c;

    }
    public static void main(String args[]){
        int[] a = {5, 4, 3, 2, 1};
        int n = 5;
        int cnt = numberOfInversions(a, n);
        System.out.println("The number of inversions are: " + cnt);
    }
}
