//Leaders in an Array
//EVERYTHING ON THE RIGHT OF THE ELEMENT SHOULD BE SMALLER
//brute force approach
// T.C=O(N^N)
//S.C=O(N)
/*    
import java.util.ArrayList;

public class leader{
    public static ArrayList<Integer> printleader(int arr[],int n){
        ArrayList<Integer>ll=new ArrayList<>();
        for(int i=0;i<n;i++){
            boolean ans=true;
            for(int j=i+1;j<n;j++){
           if(arr[j]>arr[i])
           ans=false;
            }
            ans=true;
        
        if(ans==true){
        ll.add(arr[i]);    
        }    
    }
    return ll;
}
    public static void main(String args[]){
    int arr[]={10,22,12,3,0,6};
    int n=arr.length;
    ArrayList<Integer> ans=printleader(arr, n);
    for(int i=0;i<ans.size();i++){
    System.out.println(ans.get(i));
    }
    }
}
*/
  

//OPTIMAL APPROACH
//EVERYTHING ON THE RIGHT OF THAT ELEMENT IS SMALLER ||LEADER IS SOMETHING THAT IS RIGHTMOST 
//Time Complexity: O(N) { Since the array is traversed single time back to front, it will consume O(N) of time where N = size of the array }.

//Space Complexity: O(N) { There is no extra space being used in this approach. But, a O(N) of space for ans array will be used in the worst case }.


import java.util.ArrayList;
public class leader {
    public static void printleader(int arr[],int n){
 ArrayList<Integer> ans=new ArrayList<>();

   int max=arr[n-1];
   ans.add(arr[n-1]);

   for(int i=n-2;i>=0;i--){
    if(arr[i]>max)
    ans.add(arr[i]);
    
    // update max
    max=Math.max(arr[i],max);
   }   

   // loop sidha chalane p ulta print ho rha h
   for(int i=ans.size()-1;i>=0;i--){
    System.out.print(ans.get(i)+" ");
   }
}   
 
    public static void main(String args[]){
      int arr[]={10, 22, 12, 3, 0, 6};
      int n=arr.length;
      printleader(arr, n);   
    
}
}
 
// GFG
// import java.io.*;
// import java.util.*;
// import java.util.stream.*;


// class Solution {
//     // Function to find the leaders in the array.
//     static ArrayList<Integer> leaders(int n, int arr[]) {
        
//         ArrayList<Integer> res=new ArrayList<>();
//         res.add(arr[n-1]);
//         int max=arr[n-1];
        
//         for(int i=n-2;i>=0;i--){
//           if(arr[i]>=max){
            
//             max=arr[i];
//             res.add(arr[i]);
            
//           }    
//         }
//         // to sort in decreasing order
//         Collections.sort(res, Collections.reverseOrder());
//         return res;
//     }
// }

     
