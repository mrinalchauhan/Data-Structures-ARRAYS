// print the subarray also 

public class printSubarrayKandanesAlgo {
    public static int maxSubArr(int arr[] ,int n){
        int maxsum=Integer.MIN_VALUE;
        int sum=0;
        int start=0;
        int ansEnd=-1;
        int ansStart=-1;
        for(int i=0;i<n;i++){
            
            sum=sum+arr[i];

            if(sum==0)
            start=i;
            

            if(sum>maxsum)
            maxsum=sum;

            if(sum<0)
            sum=0;
            

            ansStart=start;
            ansEnd=i;

        }
           System.out.println("The numbers of max subarray is ");
        for(int y=ansStart;y<ansEnd;y++){
            System.out.print(arr[y]+" ");
           
        }

        return maxsum;

    }
    public static void main(String args[]){
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        int ans =maxSubArr(arr,n);
         System.out.println(" ");
        System.out.println(" sum of sub array is "+ans);
    }
}
