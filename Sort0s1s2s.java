//brute force approach
// t.c=O(NLOG N) +O(N)   due to sorting and loop respectively
//S.C=O(1)
/* 
import java.util.Arrays;

public class Sort0s1s2s {
      public static void Sort(int arr[],int n){
        Arrays.sort(arr);
        System.out.println("sorted array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        }
      
      public static void main(String args[]){
        int arr[]={2,0,2,1,1,0};
        int n=arr.length;
        Sort(arr,n);
      }
    }
*/



// BETTER APPROACH
//Time Complexity: O(N) + O(N), where N = size of the array. First O(N) for counting the number of 0’s, 1’s, 2’s, and 
//      second O(N) for placing them correctly in the original array.
//Space Complexity: O(1) as we are not using any extra space.
/* 
public class Sort0s1s2s {
      public static void Sort(int arr[],int n){
        int c=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0)
            c++;

            if(arr[i]==1)
            c1++;

            if(arr[i]==2)
            c2++;
int index=0;
for(int m=0;m<c;m++){
    arr[index++]=0;
}
for(int m=0;m<c1;m++){
    arr[index++]=1;
}
for(int m=0;m<c2;m++){
    arr[index++]=2;
}
        }
      }
      public static void main(String args[]){
        int arr[]={2,0,2,1,1,0};
        int n=arr.length;
        Sort(arr,n);
       for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
       }
      }
}  
  */


  //OPTIMAL APPROACH
  // DUTCH NATIONAL FLAG ALGO

//  Time Complexity: O(N), where N = size of the given array.
//Reason: We are using a single loop that can run at most N times.

//Space Complexity: O(1) as we are not using any extra space.

  public class Sort0s1s2s {
      public static void Sort(int arr[],int n){
        int low=0;
        int mid=0;
        int high=n-1;

       while(mid<=high){
        if(arr[mid]==0){
          swap(arr,low,mid);
          low++;
          mid++;

        }
        else if(arr[mid]==1){
          mid++;
          

        }
        else{
          swap(arr,mid,high);
          high--;
        }
       }
      }
       public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
       }
        
      
      public static void main(String args[]){
        int arr[]={2,0,2,1,1,0};
        int n=arr.length;
        Sort(arr,n);
        for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
        }
      }
    }
