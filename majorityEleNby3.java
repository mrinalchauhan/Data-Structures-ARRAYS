//brute force approach
//T.C=O(n^2)
//S.C=O(1)

/* 
public class majorityEleNby3 {
    public static int majority(int arr[],int n){
    for(int i=0;i<n;i++){
        int c=1;
        for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                c++;
            }
        }
    
        if(c>(n/3))
        return arr[i];
    }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,2,3,2,4,3,4,5,4,1,4,4,1};
        int n=arr.length;
       int ans=majority(arr, n);
       System.out.println("element occ more than n/3 times is "+ans);
    }
}
*/

// this is only when repeated elements are continous 
//T.C=O(N)
//S.C=O(1)
/* 
public class majorityEleNby3 {
    public static int majority(int arr[],int n){
         int c=0;
    for(int i=0;i<n-1;i++){
         if(arr[i]==arr[i+1])
             c++;
            int val=arr[i];
        
        
        if(c>(n/3))
        return val;
    }
    return -1;
}

    public static void main(String args[]){
        int arr[]={1,2,2,2,4,4,4,5,5,5,5,5,8,8};
        int n=arr.length;
       int ans=majority(arr, n);
       System.out.println("element occ more than n/3 times is "+ans);
    }
}  
    */

//OPTIMAL APPROACH
//T.C=O(N)+O(N)
//S.C=O(1)
//when one element is answer
/* 
public class majorityEleNby3 {
    public static int majority(int arr[],int n){
        int c=0;
        int ele=0;
       for(int i=0;i<n;i++){
        if(c==0){
        c=1;             // this whole if condition is imp  isi se result aaega 
        ele=arr[i];      
        }
        else if(arr[i]==ele){
        c++;
        }
        else{
        c--;
        }
    }
        int c1=0;
      for(int m=0;m<n;m++){
        c1++;
      }
       
      if(c1>(n/3)){
        return ele;
      }
      return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,2,4,2,4,3,4,5,4,4,4,4,1};
        int n=arr.length;
       int ans=majority(arr, n);
       System.out.println("element occ more than n/3 times is "+ans);
    }
}            */


//OPTIMAL APPROACH
//T.C=O(N)+O(N)
//S.C=O(1)
//when two element is answer
import java.util.*;
public class majorityEleNby3 {
    public static List<Integer> majority(int arr[],int n){
        int c1=0;
        int c2=0;
        int ele1=0;
        int ele2=0;
       for(int i=0;i<n;i++){
        if(c1==0 && arr[i]!=ele2){
        c1=1;             // this whole if condition is imp  isi se result aaega 
        ele1=arr[i];      
        }
        else if(c2==0 && arr[i]!=ele1 ){
            c2=1;
            ele2=arr[i];
        }
        else if(arr[i]==ele1){
        c1++;
        }
        else if(arr[i]==ele2){
            c2++;
        }
        else{
        c1--; c2--;
        }
    }
    List<Integer> ls=new ArrayList<>();

        int cc1=0;
        int cc2=0;
      for(int m=0;m<n;m++){
        if(arr[m]==ele1){
         cc1++;
        }
        if(arr[m]==ele2){
            cc2++;
        }
      }
       
      if(cc1>(n/3)){
        ls.add(ele1);
      }
      if(cc2>(n/3)){
        ls.add(ele2);
      }
      return ls;
    }
    public static void main(String args[]){
        int arr[]={1,2,1,4,1,4,1,4,1,4,4,4,4,1};
        int n=arr.length;
        List<Integer> ans=majority(arr, n);
        System.out.println("Element occ more than n/3 times is ");
        for(int i=0;i<ans.size();i++){
        System.out.print(ans.get(i)+" ,");
        
       }

    }
}   

//leetcode-> better approach 

// class Solution {
//     public List<Integer> majorityElement(int[] nums) {
//      HashMap<Integer,Integer> map=new HashMap();
//      List<Integer> res=new ArrayList<>();
//      Arrays.sort(nums);
//      int n=nums.length;
//      for(int i=0;i<n;i++){
//         int val=map.getOrDefault(nums[i],0);
//         map.put(nums[i],val+1);
//      }   
//      for(Map.Entry<Integer, Integer> it : map.entrySet()){
//         if(it.getValue()>n/3){
//             res.add(it.getKey());
//         }
//      }
//      return res;
//     }
// }


