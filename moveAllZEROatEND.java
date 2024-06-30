// optimal approach  //with a time complexity of O(n).
class moveAllZEROatEND{
   public static void movee(int arr[],int n){
      int count=0;
      for(int i=0;i<n;i++){
         if(arr[i]!=0){
            arr[count++]=arr[i];
         }
      }
      while(count<n){
         arr[count++]=0;
      }
         
}
 
   public static void main(String args[]){
    int arr[]={1,0,2,1,2,0,0,3,0};
    int n=9;
    movee(arr,n);
    for(int i=0;i<n;i++){
    System.out.print(arr[i]+",");
         }
}

}




//move all zeros at end
// brute force approach
/*Time Complexity: O(N) + O(X) + O(N-X) ~ O(2*N), where N = total no. of elements,
X = no. of non-zero elements, and N-X = total no. of zeros.
Reason: O(N) for copying non-zero elements from the original to the temporary array. O(X) for again copying it back from the temporary to the original array. O(N-X) for filling zeros in the original array. So, the total time complexity will be O(2*N).

Space Complexity: O(N), as we are using a temporary array to solve this problem and the maximum size of the array can be N in the worst case.
Reason: The temporary array stores the non-zero elements. In the worst case, all the given array elements will be non-zero.
//T.C =O(N)   */
//S.C=O(N)
/*
import java.util.ArrayList;

public class allZEROatEND {
    public static void move(int arr[],int n){
  ArrayList<Integer>temp=new ArrayList<>();
        int i;
         for(i=0;i<n;i++){
            if(arr[i]!=0){
            temp.add(arr[i]);
         }
        }
        int ns=temp.size();
        System.out.println(ns +" is the length of array having non zero elements");
        for( i=0;i<ns;i++){
         System.out.print(+temp.get(i)+",");
         }
         for(i=0;i<ns;i++){
            arr[i]=temp.get(i);
         }
         for(i=ns;i<n;i++){
            arr[i]=0;
         }
         System.out.println((" "));
         System.out.println("After moving all zero to end  ");
         for(i=0;i<n;i++){
       System.out.print(arr[i]+",");  
        }
    }
public static void main(String args[]){
    int arr[]={1,0,2,1,2,0,0,3,0};
    int n=9;
    move(arr,n);
}
}     */

// class allZEROatEND{
//    public static void movee(int arr[],int n){
//       int j=-1;
//       int i;
//       for( i=0;i<n;i++){
//          if(arr[i]==0){
//             j=i;
//             break;     // imp line
//          }
//          }
//          for(i=j+1;i<n;i++){
//             if(arr[i]!=0){
//              swap(arr, i, j);
//              j++;
//          }
//          }
// }
//       public static void swap(int arr[],int i,int j){
//       int temp=arr[i];
//          arr[i]=arr[j];
//          arr[j]=temp;
//       }   
 
//    public static void main(String args[]){
//     int arr[]={1,0,2,1,2,0,0,3,0};
//     int n=9;
//     movee(arr,n);
//     for(int i=0;i<n;i++){
//     System.out.print(arr[i]+",");
//          }
// }

// }