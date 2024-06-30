//time complexity=O(N^2+M^2+((n+m)log(n+m)))
// space complexity->O(k)
// import java.util.*;
// public class union{
//     public static ArrayList<Integer> findunion(int arr1[],int arr2[],int n,int m){
//         ArrayList<Integer>arr=new ArrayList<>();
//         for(int i=0;i<arr1.length;i++){ // ->O(n)
//             if(!arr.contains(arr1[i])) // ->O(n) so that no duplicates can come in arr
//             arr.add(arr1[i]);
//         }
        
//         for(int j=0;j<arr2.length;j++){  // ->O(m)
//             if(!arr.contains(arr2[j])){ //->O(m)
//                 arr.add(arr2[j]);
//             }
//         }
//         Collections.sort(arr);  //->O((n+m)log(n+m))
//         return arr; // in output the elements are sorted
//     }

// public static void main(String args[]){
//     int arr1[]={1,1,2,3,4,5};
//     int n=6;
//     int arr2[]={2,3,6,7};
//     int m=4;
//     ArrayList res=new ArrayList<>();
//     res=findunion(arr1, arr2,n,m);
//     System.out.println("union of arr1 and arr2");
//     for(int i=0;i<res.size();i++){
//         System.out.print(res.get(i)+" ");
//     }
//     }
// }

// approach 2->two pointer approach

// import java.util.*;
// import java.io.*;
// import java.lang.*;

// class Solution
// {
//     //Function to return a list containing the union of the two arrays.
//     public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
//     {
//         ArrayList<Integer>union=new ArrayList<>();
//         int i=0;
//         int j=0;
        
//         while(i<n && j<m){
//             if(arr1[i]<arr2[j]){
//                 if(union.size()==0 || union.get(union.size()-1)!=arr1[i]){
//                     union.add(arr1[i]);
//                       i++;
//                 }
                  
                
//             }
                
//             else if(arr1[i]>arr2[j]){
//                if(union.size()==0 ||union.get(union.size()-1)!=arr2[j]){
//                     union.add(arr2[j]);
//                      j++;
//                }
                   
                
//             }
//             else{
//                 if(arr1[i]==arr2[j])
//                    if(union.size()==0|| union.get(union.size()-1)!=arr1[i])
//                        union.add(arr1[i]);
//                            i++;
//                            j++;
//             }
            
//         }
//         while(i<n){
//             if(union.size()==0||union.get(union.size()-1)!=arr1[i]){
//                 union.add(arr1[i]);
//                 }
//                i++;
//         }
//         while(j<m){
//             if(union.size()==0|| union.get(union.size()-1)!=arr2[j]){
//                 union.add(arr2[j]);
//             }
//                 j++;
            
//         }
//         return union;
        
//     }
// }


import java.util.*;
public class union{
    public static ArrayList<Integer> findunion(int arr1[],int arr2[],int n,int m){
        HashSet<Integer>hashset=new HashSet<>();
        for(int i=0;i<n;i++){
            hashset.add(arr1[i]);
        }
        for(int i=0;i<m;i++){
            hashset.add(arr2[i]);
        }
        ArrayList res=new ArrayList<>(hashset);
        Collections.sort(res);
        return res;
    }

public static void main(String args[]){
    int arr1[]={1,1,2,3,4,5};
    int n=6;
    int arr2[]={2,3,6,7};
    int m=4;
    ArrayList res=new ArrayList<>();
    res=findunion(arr1, arr2,n,m);
    System.out.println("union of arr1 and arr2");
    for(int i=0;i<res.size();i++){
        System.out.print(res.get(i)+" ");
    }
    }
}
