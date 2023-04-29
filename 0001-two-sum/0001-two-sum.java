class Solution {
    public int[] twoSum(int[] nums, int target) {
        //-------Brute Force-------//
        int len=nums.length;
        
        //----using two for loop methods-----//
        int ind[]=new int[2];
       
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    ind[0]=i;
                    ind[1]=j;
                    return ind;
                }
            }
        }

        // int x[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     x[i]=nums[i];
        // }
        // Arrays.sort(nums);

        // int low=0;
        // int up=nums.length-1;
        // while(low<up){
        //     int sum=nums[low]+nums[up];
        //     if(sum==target){
        //         int ans[]=new int[2];
        //         int flag=0;
        //         for(int i=0;i<x.length;i++){
        //             if(x[i]==nums[low]&&flag!=1){
        //                 ans[0]=i;
        //                 flag++;
        //             }
        //             else if(x[i]==nums[up]){
        //                 ans[1]=i;
        //                 flag++;
        //             }
        //             if(flag==2){
        //                 return ans;
        //             }
        //         }
        //     }else if(sum<target){
        //         low++;
        //     }else{
        //         up--;
        //     }
        // }
        return null;
    }
}