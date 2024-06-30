//print all permutations
//T.C=O(n!)
//S.C=O(n)
public class printAllPermutation {
    public static void permute(int ind,int arr[]){
        for(int i=ind;i<arr.length;i++){
             swap(i,ind,arr);
             permute(ind+1,arr);
             swap(i,ind,arr);
        }
        if(ind==arr.length){
            for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
    }
    }
    public static void swap(int i,int j,int arr[]){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        System.out.println("All permutation");
        permute(0,arr);

    }
}
 


 