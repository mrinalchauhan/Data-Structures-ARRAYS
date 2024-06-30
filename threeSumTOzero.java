
//3 Sum : Find triplets that add up to a zero
//BRUTE FORCE
//Time Complexity: O(N^3 * log(no. of unique triplets)), where N = size of the array.
//Reason: Here, we are mainly using 3 nested loops. And inserting triplets into the set takes O(log(no. of unique triplets)) time complexity. But we are not considering the time complexity of sorting as we are just sorting 3 elements every time.

//Space Complexity: O(2 * no. of the unique triplets) as we are using a set data structure and a list to store the triplets

/* 

import java.util.*;
public class threeSumTOzero {
    public static List<List<Integer>> threeSum(int arr[],int n){
        Set<List<Integer>> st =new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                    List<Integer> ls=Arrays.asList(arr[i],arr[j],arr[k]);
                    ls.sort(null);
                        st.add(ls);
                 }   
            }
        }
    }
   List<List<Integer>> temp=new ArrayList<>(st);
   return temp;
    }

    public static void main(String args[]){
      int arr[]={-1,0,1,2,-1,-4};
      int n=6;
      List<List<Integer>> ans=threeSum(arr,n);
      System.out.println("The elements are ");
      for(int i=0;i<ans.size();i++){
        System.out.println(ans.get(i));
      }
}

}    */

//BETTER APPROACH
//Time Complexity: O(N2 * log(no. of unique triplets)), where N = size of the array.
//Reason: Here, we are mainly using 3 nested loops. And inserting triplets into the set takes O(log(no. of unique triplets)) time complexity. But we are not considering the time complexity of sorting as we are just sorting 3 elements every time.

//Space Complexity: O(2 * no. of the unique triplets) + O(N) as we are using a set data structure and a list to store the triplets and extra O(N) for storing the array elements in another set.
/* 

import java.util.*;
public class threeSumTOzero {
    public static List<List<Integer>> threeSum(int arr[],int n){
         Set<List<Integer>> hash=new HashSet<>();
        for(int i=0;i<n;i++){
            HashSet<Integer> hashset=new HashSet<>();
            for(int j=i+1;j<n;j++){
                int third=-(arr[i]+arr[j]);
               
                if(hashset.contains(third)){
                    List<Integer> list=Arrays.asList(arr[i],arr[j],third);
                    list.sort(null);
                    hash.add(list);
                }
                hashset.add(arr[j]);
        }
    }
    List<List<Integer>> ans=new ArrayList<>(hash);
     return ans;
    }
    public static void main(String args[]){
      int arr[]={-1,0,1,2,-1,-4};
      int n=6;
      List<List<Integer>> res=threeSum(arr, n);
      for(int i=0;i<res.size();i++){
        System.out.println(res.get(i));
      }  
}
}
   */

   //OPTIMAL 
   //Time Complexity: O(NlogN)+O(N2), where N = size of the array.
   //Reason: The pointer i, is running for approximately N times. And both the pointers j and k combined can run for approximately N times including the operation of skipping duplicates. So the total time complexity will be O(N2). 
   //Space Complexity: O(no. of triplets), This space is only used to store the answer. We are not using any extra space to solve this problem. So, from that perspective, space complexity can be written as O(1).
   import java.util.*;
   public class threeSumTOzero{
    public static List<List<Integer>> three(int arr[],int n){
       List<List<Integer>> list=new ArrayList<>();
    
        Arrays.sort(arr);
       for(int fix=0;fix<n;fix++){
        if (fix != 0 && arr[fix] == arr[fix - 1]) continue;    // imp line to print unique set of arrays . we could have used hashset as used in above two approaches but it will eventually inc the time complexity..here in this way it will take constant time complexity

       int left=fix+1;
       int right=n-1;
       while(left<right){
        int sum=arr[fix]+arr[left]+arr[right];
        if(sum<0){
            left++;

        }
        else if(sum>0){
            right--;
        }
        else if(sum==0){
        List<Integer> ll=Arrays.asList(arr[fix],arr[left],arr[right]);
         list.add(ll);
           left++;
           right--;

           /*while(arr[left]==arr[left-1])
           left++;                             //these two loops are not required for correct answer output


           while(arr[right]==arr[right+1])
           right++;   */
           
        }
       }
    }
   
    return list;

}
   public static void main(String args[]){
    int arr[]={-1,0,1,2,-1,-4};
      int n=6;
      List<List<Integer>> res=three(arr, n);
      
      System.out.println("The unique triplet elements set whose sum is zero: ");
      for(int i=0;i<res.size();i++){
        System.out.println(res.get(i));
      }  
   }
   }