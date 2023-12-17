class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        if(nums.length%3 !=0) return new int[0][0];
        
        int n=nums.length/3;
        int[][] ans=new int[nums.length/3][3];
        
        Arrays.sort(nums);
        
        for(int i=0; i<=nums.length-3;i+=3)
        {
            int diff=nums[i+2] - nums[i];
            
            if(diff>k) return new int[0][0];
            
        }
        
        int ind=0;
        for(int i= 0 ;i < n ;i++){
            for(int j=0; j<3 ;j++){
                ans[i][j]=nums[ind];
                ind++;
            }
        }
        return ans;
    }
}