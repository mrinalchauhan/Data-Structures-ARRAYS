public class rearrangeArrByAltPosNeg {
    public static int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int [] pos=new int[n];
        int [] neg=new int[n];
        int [] res=new int[n];
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos[j++]=nums[i];
            }
            else if(nums[i]<0){
                neg[k++]=nums[i];
            }
        }
        int m=0;
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                res[i]=pos[m++];
            }
            else{
                res[i]=neg[p++];
            }
          }
        return res;
    }
    public static void main(String args[]){
        int arr[]={1,2,-4,-5};
        System.out.println("rearranging array in alternating positive and negative elements ");
       int res[]=rearrangeArray(arr);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]+" ");
        }
    }
}

