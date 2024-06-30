//Find the repeating and missing numbers
//brute force approach
//T.C=O(N^3)
//S.C=O(1)
/* 
public class repeatingAndMissingEle {
    public static void print(int arr[],int n){
        int miss=0;
        int repeat=0;
        int c=1;
    for(int i=0;i<n;i++){
        for(int j=1;j<n;j++){
            if(arr[i]!=j)
            miss=j;
        }
        for(int m=i+1;m<n;m++){
            if(arr[i]==arr[m])
              c++;
              repeat=i;
        }
    }
    System.out.println("Missing element is "+miss);
    System.out.println(repeat+" is repeated "+c+" times");
}
public static void main(String args[]){
    int arr[]={3,1,2,5,3};
    int n=arr.length;
    print(arr,n);
}
}
    */


// brute force
//T.C=O(n^2)
//S.C=O(1)
/* 
public class repeatingAndMissingEle {
    public static void print(int arr[],int n){
        int miss=0;
        int repeat=0;
        
    for(int i=1;i<n;i++){
        int c=0;
        for(int j=0;j<n;j++){
            if(arr[j]==i)
            c++;
        }
        if(c==0)
        miss=i;

       else if(c==2)
        repeat=i;       
        }
    System.out.println("Missing element is "+miss);
    System.out.println(repeat+" is repeated element");
    }
public static void main(String args[]){
    int arr[]={3,1,2,5,3};
    int n=arr.length;
    print(arr,n);
}
}
    */

//OPTIMAL APPROACH
//Time Complexity: O(N), where N = the size of the given array.
//Reason: We are using only one loop running for N times. So, the time complexity will be O(N).

//Space Complexity: O(1) as we are not using any extra space to solve this problem.
    public class repeatingAndMissingEle {
    public static void print(int arr[],int n){
       int s=n*(n+1)/2;
       int ss = n * (n + 1) * (2 * n + 1) / 6;
        int s1=0;
        int ss1=0;
      
       for(int i=0;i<n;i++){
        s1=s1+arr[i];
        ss1=ss1+(arr[i]*arr[i]);

       }
       int eq1=s-s1;
       int eq2=ss-ss1;
       eq2=eq2/eq1;
        int x=(eq1+eq2)/2;
       int y=x-eq1;

        System.out.println("missing number "+x);
        System.out.println("repeated number "+y);

    }
public static void main(String args[]){
    int arr[]={3,1,2,5,3};
    int n=arr.length;
    print(arr,n);
}
}