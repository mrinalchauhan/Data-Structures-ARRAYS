// PRINT THE NEXT PERMUTATION 
//T.C=O(N)
//S.C=O(1)
public class nextPermutation {
    public static void permute(int arr[]){
        int n=arr.length;
        int ind=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>arr[i+1]){
                ind=i;
                break;
            }
        }
         if(ind==-1)
         reverse(arr, 0, n-1);
         
        for(int i=n-1;i>ind;i--){
            swap(i,ind,arr);
        }
        reverse(arr, ind+1, n-1);
    }
    public static void reverse(int arr[],int start,int end){
       while(start<end)
       {
          swap(start,end,arr);
          start++;
          end--;
       }

    }
    public static void swap(int i,int j,int arr[]){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void main(String args[]){
        int arr[]={3,1,2};
        int n=arr.length;
        permute(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
