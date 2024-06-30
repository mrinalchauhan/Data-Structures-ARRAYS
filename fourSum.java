//4 Sum ->| Find Quads that add up to a target value
//brute force approach
//Time Complexity: O(N4), where N = size of the array.
//Reason: Here, we are mainly using 4 nested loops. But we not considering the time complexity of sorting as we are just sorting 4 elements every time.

//Space Complexity: O(2 * no. of the quadruplets) as we are using a set data structure and a list to store the quads.

/* 
import java.util.*;
public class fourSum {
     public static List<List<Integer>> four(int arr[],int tar){
        Set<List<Integer>>hash=new HashSet<>();  // use this type ..when hashset use krna hoga tb..kyuki list ko add krna hai n..JB LIST KO ADD KRNA HOGA TB ISI TYPE KA HASHSET BNANA..NOT THE HashSet<Integer> hash= new HashSet<>();  is vale se to element ko add krne ke liye hota h..list ke liye nae    
        int n=arr.length;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
         for(int k=j+1;k<n;k++){
            int sum=0;       // isko sbse upper nhi likhna..jha use horha h uske sbse ps lihna hai ..range ka dyan rhkte hue
          for(int l=k+1;l<n;l++){
            sum=sum+arr[i]+arr[j];
            sum=sum+arr[k];
            sum=sum+arr[l];
            if(sum==tar){
        List<Integer>ll=Arrays.asList(arr[i],arr[j],arr[k],arr[l]);
          ll.sort(null);
            hash.add(ll);
         }
        }
       }
      } 
    }
    List<List<Integer>> list=new ArrayList<>(hash);
    return list;
   }
     public static void main(String args[]){
        int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        System.out.println("The unique four elements set is:");
        List<List<Integer>> ans=four(arr, target);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
     }
} 
   */
//Better Approach (Using 3 loops and set data structure): 
//Time Complexity: O(N3*log(M)), where N = size of the array, M = no. of elements in the set.
//Reason: Here, we are mainly using 3 nested loops, and inside the loops there are some operations on the set data structure which take log(M) time complexity.
//Space Complexity: O(2 * no. of the quadruplets)+O(N)
//Reason: we are using a set data structure and a list to store the quads. This results in the first term. And the second space is taken by the set data structure we are using to store the array elements. At most, the set can contain approximately all the array elements and so the space complexity is O(N).

/* 
import java.util.*;
public class fourSum {
     public static List<List<Integer>> four(int arr[],int tar){
      Set<List<Integer>> hash=new HashSet<>();
        int n=arr.length;
       HashSet<Integer> hashset=new HashSet<>();
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          int sum=0;
          for(int k=j+1;k<n;k++){
             sum=sum+arr[i]+arr[j];
             sum=sum+arr[k];
             int l=tar-sum;
             if(hashset.contains(l)){
             List<Integer> ll=Arrays.asList(arr[i],arr[j],arr[k],l);
             ll.sort(null);
                hash.add(ll);
             }
            hashset.add(arr[k]);
          }
        }
       }
       List<List<Integer>> ans=new ArrayList<>(hash);
       return ans;
       
      }
     public static void main(String args[]){
        int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;
        System.out.println("The unique four elements set is:");
        List<List<Integer>> ans=four(arr, target);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
     }
}
   */

   
//OPTIMAL APPROACH
import java.util.*;
public class fourSum {
     public static List<List<Integer>> four(int arr[],int tar){
        Arrays.sort(arr);

      
      Set<List<Integer>> hash=new HashSet<>();
      int n=arr.length;
      
        for(int fix1=0;fix1<n-3;fix1++){
            for(int fix2=fix1+1;fix2<n-2;fix2++){
               int sum=0;
               int left=fix2+1;
               int right=n-1;
               sum=sum+arr[fix1]+arr[fix2];
               sum=sum+arr[left];
               sum=sum+arr[right];

               while(left<right){
                 if(sum==tar){
                  List<Integer>ll=Arrays.asList(arr[fix1],arr[fix2],arr[left],arr[right]);
                    ll.sort(null);
                    hash.add(ll);
                    left++;
                    right--;

                 }
                 else if(sum<0){
                  left++;
                 }
                else if(sum>0){
                  right--;
                }
               }
            }
        }
        List<List<Integer>> list=new ArrayList<>(hash);
        return list;
      
     }
     public static void main(String args[]){
        int[] arr = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = arr.length;
        System.out.println("The unique four elements set is:");
        List<List<Integer>> ans=four(arr, target);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
     }
}
   