
//Find the Majority Element that occurs more than N/2 times
//BRUTE FORCE APPROACH
//Time Complexity: O(N^N), where N = size of the given array. Reason: For every element of the array the inner loop runs for N times. And there are N elements in the array. So, the total time complexity is O(N^N).
//Space Complexity: O(1) as we use no extra space.
/* 
public class majorityEleOcc {
        public static int majority(int arr[],int n){
            int c=0;
                  for(int i=0;i<n-1;i++){
                    for(int j=i+1;j<n;j++){
                        if(arr[i]==arr[j])
                        c++;
                  
                    }
                        if(c>n/2)
                        return arr[i];       
                    
                  }
                  return -1;
        }
        public static void main(String args[]){
            int arr[]={2,2,1,1,1,1,1,1};
            int n=arr.length;
            int ans= majority(arr,n);
            System.out.println(ans+"  is the majority element");

        }
}    */


// better approach by own
// T.C=O(N)    used only one loop
// S.C=O(1)

/* 
// THIS IS ONLY VALID WHEN ELEMENTS ARE REPEATED IN CONTINUOUS MANNER ONLY
public class majorityEleOcc {
        public static int majority(int arr[],int n){
            int c=0;
                  for(int i=0;i<n-1;i++){
                    if(arr[i]==arr[i+1])
                        c++;
                  
                    
                        if(c>n/2)
                        return arr[i];
                               
                    
                  }
                  return -1;
        }
        public static void main(String args[]){
            int arr[]={2,2,1,1,1,1,1,1,2};
            int n=arr.length;
            int ans= majority(arr,n);
            System.out.println(ans+"  is the majority element");

        }
    }  
     */

// another method by hashmap not done


//Optimal Approach: Moore’s Voting Algorithm
//Time Complexity: O(N) + O(N), where N = size of the given array.
//Reason: The first O(N) is to calculate the count and find the expected majority element.
// The second one is to check if the expected element is the majority one or not
// Space Complexity: O(1) as we are not using any extra space.
public class majorityEleOcc {
        public static int majority(int arr[],int n){
            int c=0;
            int ele=0;
            for(int i=0;i<n;i++){
                  if(c==0){
                    c=1;
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
            for(int i=0;i<n;i++){
                  c1++;
            }
            
            if(c1>(n/2)){
                return ele;
            }
            return -1;
        }
        public static void main(String args[]){
            int arr[]={2,2,1,1,1,1,1,1,1,1,1,2};
            int n=arr.length;
            int ans= majority(arr,n);
            System.out.println(ans+"  is the majority element");

        }
    }

