
//Merge two Sorted Arrays Without Extra Space
//brute force approach
//uses extra space
//Time Complexity: O(n+m) + O(n+m), where n and m are the sizes of the given arrays.
//Reason: O(n+m) is for copying the elements from arr1[] and arr2[] to arr3[]. And another O(n+m) is for filling back the two given arrays from arr3[].

//Space Complexity: O(n+m) as we use an extra array of size n+m.

/* 
public class mergeSortedArr {
    public static void merge(int arr1[],int n,int arr2[],int m){
      int pnt1=0;
      int pnt2=0;
      int arr3[]=new int[n+m];
      int index=0;
  while(pnt1<n && pnt2<m){
      if(arr1[pnt1]<=arr2[pnt2]){
        arr3[index]=arr1[pnt1];
        pnt1++;
        index++;  
      }
    else
      {
        arr3[index]=arr2[pnt2];
        pnt2++;
        index++;
      } 
    }  
    // pnt2 reaches end
     while(pnt1<n){
        arr3[index++]=arr1[pnt1++];
    }
      //pnt1 reaches end
    while(pnt2<m){
        arr3[index++]=arr2[pnt2++];
    }  
      for(int i=0;i<n+m;i++){
        if(i<n)
        arr1[i]=arr3[i];
        else
        arr2[i-n]=arr3[i];   // this order is imp..arr2 m put krna h arr3 ka value 
      } 
    }
    public static void main(String args[]){
        int arr1[]={1,4,8,10};
        int n=arr1.length;
        int arr2[]={2,3,9};
        int m=arr2.length;

        merge(arr1,n,arr2,m);
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        for(int i=0;i<m;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println(" ");   
    }   
}
   */


// Time Complexity: O(min(n, m)) + O(n*logn) + O(m*logm), where n and m are the sizes of the given arrays.
//Reason: O(min(n, m)) is for swapping the array elements. And O(n*logn) and O(m*logm) are for sorting the two arrays.

//Space Complexity: O(1) as we are not using any extra space.
   import java.util.*;
   public class mergeSortedArr {
    public static void merge(int arr1[],int n,int arr2[],int m){
     int p1=n-1;
     int p2=0;
     while(p1>=0 && p2<m){
        if(arr1[p1]>arr2[p2]){
       int temp=arr1[p1];
       arr1[p1]=arr2[p2];
       arr2[p2]=temp;

       p1--;
       p2++;
        }
        else{
            break;    // very imp block
        }  
     }
     Arrays.sort(arr1);
     Arrays.sort(arr2);
    }
    public static void main(String args[]){
        int arr1[]={1,4,8,10};
        int n=arr1.length;
        int arr2[]={2,3,9};
        int m=arr2.length;

        merge(arr1,n,arr2,m);
        System.out.println("Merge Sorted Array ");
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
        for(int i=0;i<m;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println(" ");   
    }   
}
   