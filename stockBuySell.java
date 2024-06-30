//Stock Buy And Sell
// brute force approach
//Time complexity: O(n^2)
//Space Complexity: O(1)
/* 
public class stockBuySell {
    public static void stock(int arr[],int n){
        int maxpro=0;
         for(int i=0;i<n;i++){
            for(int j=i;j<n;j++)  // J is greater number i.e sell price .loop starts from i i.e buy price (j will be present after i)
            {
               if(arr[i]<arr[j])
               {   
                System.out.print("min "+arr[i]);
                System.out.println(" max "+arr[j]);
                int diff=arr[j]-arr[i];
                System.out.println(" possible profit "+diff);
                maxpro=Math.max(maxpro,diff);
                }
               }      
         }
         System.out.println("MAXPROFIT AMONG THESE "+maxpro);
        }

    
    public static void main(String args[]){
        int arr[]={7,2,1,5,3,6,4};
        int n=arr.length;
        stock(arr, n);       
    }
    
}   */

//OPTIMAL APPROACH

public class stockBuySell {
    public static void stock(int arr[],int n){
        
        int minprice=Integer.MAX_VALUE;
        int maxpro=0;
         for(int i=0;i<n;i++){
         minprice=Math.min(minprice,arr[i]);
         maxpro=Math.max(maxpro,arr[i]-minprice);   // ye nhi samjh aya
         }
         System.out.println("MINIMUM PRICE " +minprice);
    
         System.out.println("maximum profit "+maxpro);   
        }
        public static void main(String args[]){
        int arr[]={7,2,1,5,3,6,4};
        int n=arr.length;
        stock(arr, n);
        }  
    }