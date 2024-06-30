// FIND NO OF REVERSE PAIRS ... REVERSE PAIRS ARE THE PAIRS WHERE arr[i]=2*arr[j]
//brute force approach
//Time Complexity: O(N^2), where N = size of the given array.
//Reason: We are using nested loops here and those two loops roughly run for N times.

//Space Complexity: O(1) as we are not using any extra space to solve this problem.
/* 
public class countReversePairs {
     public static int pairs(int arr[],int n){
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>2*arr[j]){
                    c++;
                }
            }
        }
        return c;
     }
     public static void main(String args[]){
        int arr[]={40,25,19,12,9,6,2};
        int n=arr.length;
        int ans=pairs(arr,n);
        System.out.println("no of reverse pairs "+ans);
     }   
}
   */
  //optimal approach 
  // with help of merge sort

import java.util.ArrayList;



public class countReversePairs{
    
public static void merge(int arr[],int low,int mid,int high){
    mid=(low+high)/2;
    int p1=low;
    int p2=mid+1;
    ArrayList<Integer>temp=new ArrayList<>();
    while(p1<=mid && p2<=high){
        if(arr[p1]<=arr[p2]){
            temp.add(arr[p1]);
            p1++;

        }
        else{
            temp.add(arr[p2]);
            p2++;
        }
    }
    while(p1<=mid){
        temp.add(arr[p1]);
        p1++;
    }
    while(p2<high){
        temp.add(arr[p2]);
        p2++;
    }
    for(int i=low;i<=high;i++){
        arr[i]=temp.get(i-low);
    }
    }
public static int mergesort(int arr[],int low,int high){
        int c=0;
        if(low==high){
            return c;
        }
        int mid=(low+high)/2;
       c=c+ mergesort(arr,low,mid);
       c=c+ mergesort(arr,mid+1,high);
       c=c+ countPairs(arr, low,mid, high);
        merge(arr,low,mid,high);

        return c;
    }
public static int countPairs(int arr[],int low,int mid,int high){
        int c=0;
        
        int p2=mid+1;
        for(int i=low;i<=mid;i++){
            while(arr[i]>2*arr[p2] && p2<=high){
                p2++;
                c=c+(p2-(mid+1));

            }
        }     
      return c;
}

public static int finall(int arr[],int n){
       int a1=mergesort(arr,0,n-1);
       return a1;
    }
       public static void main(String args[]){
        int arr[]={1,3,2,3,1};
        int n=5;
        int ans =finall(arr,n);
        System.out.println("no of reverse pairs "+ans);

    }
  
}