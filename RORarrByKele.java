/* 
//Rotate array by K elements
// brute force approach
//T.C O(N)
//S.C O(N)
public class RORarrByKele {
       public static void leftrotate(int arr[],int n,int k){
                k=k%n;
              int temp[]=new int[k];
              for(int i=0;i<k;i++){
                temp[i]=arr[i];
       }
              for(int i=k;i<n;i++){
                arr[i-(k)]=arr[i];
                  }
                // temp m aage ka teen value hai usko arr ke peeche lagana h
           for(int i=n-k;i<n;i++){
              arr[i]=temp[i-(n-k)];
           }

           for(int i=0;i<n;i++){
            System.out.print(arr[i]+",");
           }
       }
       public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int n=7;
        leftrotate(arr, n, 3);
       }                         
  }                 */

  // RECURSIVE OPTIMAL APPROACH
  //T.C O(N)
  //S.C O(I)

  public class RORarrByKele {
       public static void REVERSE(int arr[],int start,int end){
                
              while(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
              }
            }
      public static void leftRORreverse(int arr[],int n,int k){
            REVERSE(arr,0,n-k-1);
            REVERSE(arr, n-k, n-1);
            REVERSE(arr, 0, n-1);

            for(int i=0;i<n;i++){
              System.out.print(arr[i]+",");
            }
      }
       public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int n=7;
        leftRORreverse(arr, n, 3);
       }                         
      }  
         
      //    public class RORarrByKele {
      //  public static void leftrotate(int arr[],int n,int k){
      //           k=k%n;
      //         int temp[]=new int[k];
      //         for(int i=0;i<k;i++){
      //           temp[i]=arr[i];
      //  }
      //         for(int i=k;i<n;i++){
      //           arr[i]=arr[n-i+1];
      //             }
      //           // temp m aage ka teen value hai usko arr ke peeche lagana h
      //      for(int i=0;i<k;i++){
      //         temp[i]=arr[n-i];
      //      }

      //      for(int i=0;i<n-1;i++){
      //       System.out.print(arr[i]+",");
      //      }
      //  }
      //  public static void main(String args[]){
      //   int arr[]={1,2,3,4,5,6,7};
      //   int n=6;
      //   leftrotate(arr, n, 3);
      //  }                         
      // }