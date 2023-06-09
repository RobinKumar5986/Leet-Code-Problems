class Solution {
    public int[] twoSum(int[] nums, int target) {
        // // -------Brute Force-------//
        // int len=nums.length;
        
        // //----using two for loop methods-----//
        // int ind[]=new int[2];
       
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if((nums[i]+nums[j])==target){
        //             ind[0]=i;
        //             ind[1]=j;
        //             return ind;
        //         }
        //     }
        // }
        
        int ans[]=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if(map.containsKey(temp)){
                ans[0]=i;
                ans[1]=map.get(temp);
                break;
            }
            map.put(nums[i],i);   
        }

        return ans;
    }
}