//Rearrange Array Elements by Sign such that every negative element is at alternative position making sure that order of the elements remains same
// brute force approach
//T.C =O(nlogn)    due to sorting
//S.C =O(n)
//Time Complexity: O(N+N/2) { O(N) for traversing the array once for segregating positives and negatives and another O(N/2) for adding those elements alternatively to the array, where N = size of the array A}.

//Space Complexity:  O(N/2 + N/2) = O(N) { N/2 space required for each of the positive and negative element arrays, where N = size of the array A}.
/* 
import java.util.*;
public class rearrandeArr {
    public static int[] rearrange(int arr[],int n){
      ArrayList<Integer> pos=new ArrayList<>();
      ArrayList<Integer> neg=new ArrayList<>();
           
     for(int i=0;i<n;i++){
        if(arr[i]>0)
        {
            pos.add(arr[i]);
        }
        else
        {
         neg.add(arr[i]);
        }
        }

        for(int i=0;i<n/2;i++){
         arr[2*i]=pos.get(i);
        arr[2*i+1]=neg.get(i);
        }
return arr;
    }

    public static void main(String  args[]){
     int arr[] = {1,2,-4.-5};
     int n=arr.length;
        int ans[]=rearrange(arr, n);
        System.out.println("After arrangement such that negative elements is in alternate position ");
       for(int i=0;i<n;i++){
        System.out.print(ans[i]+" ");
       }
    }
}              */


// NAE SAMJH AAYA H YHA SE AAUR RUN BHI NHI HORHA H
// optimal
//Time Complexity: O(N) { O(N) for traversing the array once and substituting positives and negatives simultaneously using pointers, where N = size of the array A}.

//Space Complexity:  O(N) { Extra Space used to store the rearranged elements separately in an array, where N = size of array A}.
/* 
import java.util.*;
import java.util.ArrayList;
public class rearrandeArr {
    public static ArrayList<Integer> rearrange(ArrayList<Integer>arr){
      //ArrayList<Integer> pos=new ArrayList<>();
      //ArrayList<Integer> neg=new ArrayList<>();
      ArrayList<Integer>ans=new ArrayList<>();
       int n=arr.size();
           int negin=1;
           int posin=0;
        for(int i=0;i<n;i++){
        if(arr.get(i)>0){
            ans.set(posin,arr.get(i));
            posin=posin+2;
        }
        else{
            ans.set(negin,arr.get(i));
            negin=negin+2;
        }
    }
    return ans;
    }
    public static void main(String  args[]){
     ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,-4,-5));
    
        ArrayList<Integer>ans =rearrange(arr);
        System.out.println("After arrangement such that negative elements is in alternate position ");
       
        for(int i=0;i<ans.size();i++){
        System.out.print(ans.get(i)+" ");
       }
    }
}   */
import java.util.*;
public class rearrandeArr {
    public static ArrayList<Integer> rearrange(ArrayList<Integer>arr){
      ArrayList<Integer> pos=new ArrayList<>();
      ArrayList<Integer> neg=new ArrayList<>();
      //ArrayList<Integer>ans=new ArrayList<>();
       int n=arr.size();
           //int negin=1;
           //int posin=0;
        for(int i=0;i<n;i++){
        if(arr.get(i)>0){
            pos.add(i);
        }
        else{
           neg.add(i);
        }
    }
    if(pos.size()>neg.size()){
         for(int i=0;i<neg.size();i++){
            arr.set(2*i,pos.get(i));
            arr.set(2*i+1,neg.get(i));
         }
         int ind=neg.size()*2;
         for(int i=neg.size();i<pos.size();i++){
            arr.set(ind,pos.get(i));
            ind++;
         }
    }
    else{
        for(int i=0;i<pos.size();i++){
            arr.set(2*i,pos.get(i));
            arr.set(2*i+1,neg.get(i));
        }
        int ind=pos.size()*2;
        for(int i=pos.size();i<neg.size();i++){
            arr.set(ind,neg.get(i));
            ind++;
      }
   }
    return arr;
 }
    public static void main(String  args[]){
     ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,2,-4,-5,3,4,5,6));
    
        ArrayList<Integer>ans =rearrange(arr);
        System.out.println("After arrangement such that negative elements is in alternate position ");
       
        for(int i=0;i<ans.size();i++){
        System.out.print(ans.get(i)+" ");
       }
    }
}
