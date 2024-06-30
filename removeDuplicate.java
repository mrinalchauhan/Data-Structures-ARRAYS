
// remove duplicate from SORTED array

//Time complexity: O(n + k)=>  O(N)+O(1)+O(K)
//Space Complexity: O(n) 

 // brute force
import java.util.HashSet;

public class removeDuplicate {
    public static int removeDup(int arr[],int n){
        HashSet<Integer> has= new HashSet<>();
        for(int i=0;i<n;i++){
            has.add(arr[i]);
        }
           int k= has.size();
           return k; // returns the array after removing duplicate
           }
    
    public static void main(String args[]){
    int arr[]={1,1,2,2,2,3};
    int n=arr.length;
    int ans=removeDup(arr,n);
    System.out.println(ans);
    }
}       



// OPTIMAL SOLUTION
//   T.C=O(N)
// //   S.C=O(1)
// public class removeDuplicate {
//     public static int removeDup(int arr[]){
//     int i=0;
//     int n=arr.length;

//     for(int j=1;j<n;j++){
//         if(arr[i]!=arr[j]){
//               i++;
//               arr[i]=arr[j];  // arr[i] will have all unique elements of the array
//         }
//     }
//         return i+1;   // rerurns the size of arr[i] that has unique elements of the array
//     }
    
//     public static void main(String args[]){
//     int arr[]={1,2,3,3};
//     int k =removeDup(arr);
//       for(int i=0;i<k;i++){
//         System.out.println("After removing duplicate the array is "+arr[i]);
//       }
//     }
// }


// coding ninja
// public class Solution {
//   public static int removeDuplicates(int[] arr,int n) {
//       int i=0;
//   for(int j=1;j<n;j++){
//     if(arr[i]!=arr[j]){
//       i++;
//       arr[i]=arr[j];
//     }
//   }
//   return i+1;
//   }

// }
