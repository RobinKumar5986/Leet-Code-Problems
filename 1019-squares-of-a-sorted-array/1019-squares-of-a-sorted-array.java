class Solution {
    public int[] sortedSquares(int[] nums) {
        // int square[]=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     square[i]=nums[i]*nums[i];
        // }
        // Arrays.sort(square);
        // return square;
    // }

    //----two pointer Solution-----//
        int hi=nums.length-1;
        int lo=0;
        int[] ans=new int[nums.length];
        int k=ans.length-1;

        while(lo<=hi){
            int s1=nums[lo]*nums[lo];
            int s2=nums[hi]*nums[hi];

            if(s2>s1){
                ans[k]=s2;
                hi--;

            }else{
                ans[k]=s1;
                lo++;
            }
            k--;

        }
        return ans;

    }
}