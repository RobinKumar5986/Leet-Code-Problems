class Solution {
    public int maxProduct(int[] nums) {
        int ma=nums[0];
        int mi=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
             if(nums[i]<0)
            {
               int temp=ma;
               ma=mi;
               mi=temp;
            }
            ma=Math.max(nums[i],ma*nums[i]);

            mi=Math.min(nums[i],mi*nums[i]);

            ans=Math.max(ans,ma);
           
        }
        return ans;


    //     if(nums.length==1) return nums[0];

    //    int mul=1;
    //    int old=Integer.MIN_VALUE;
    //    int min=Integer.MIN_VALUE;
    //    boolean f=false;
    //    boolean z=false;
    //    boolean ne=false;
    //    for(int i=0;i<nums.length;i++){
    //        if(nums[i]>0){
    //            f=true;
    //            if(ne==true){

    //            }
    //            mul=mul*nums[i];
    //        }
    //        if(nums[i]==0){
    //            z=true;
    //        }
    //        if(nums[i]<0){
    //            if(old<mul){
    //                old=mul;
    //            }
    //            if(nums[i]>min){
    //                min=nums[i];
    //            }
    //            mul=1;
    //        }
    //    }

    //    if(z==true && f==false) return 0;

    //    if(z==false && f==false) return min;

    //    return old;


    }
}