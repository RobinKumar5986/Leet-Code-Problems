class Solution {
    public void sortColors(int[] nums) {
        int z=0;
        int o=0;
        int t=0;
        for(int ele : nums)
        {
            if(ele == 0) z++;
            else if(ele == 1) o++;
            else t++;
        }
        int i=0;
        while(z>0){
            nums[i++]=0;
            z--;
        }
        while(o>0){
            nums[i++]=1;
            o--;
        }
        while(t>0){
            nums[i++]=2;
            t--;
        }
    }
}