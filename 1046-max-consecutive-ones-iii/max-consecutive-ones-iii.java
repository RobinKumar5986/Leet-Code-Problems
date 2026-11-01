class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        if(k == 0) {
            //max 1's togeather
            int co = 0;
            for(int ele : nums) {
                if(ele == 0){
                    ans = Math.max(co,ans);
                    co = 0;
                }else{
                    co++;
                }
            }
            ans = Math.max(co,ans);
        }else{

            int lo = 0;
            int hi = 0;
            int flp = 0;
            while(lo <= hi && hi < nums.length) {
                // System.out.println("st: " + lo + " : " + hi + " : " + ans + " : " + flp);
                if(nums[hi] == 1) {
                    ans = Math.max(ans,hi-lo+1);
                }else{
                    if(flp < k ){
                        flp++;
                        ans = Math.max(ans,hi-lo+1);
                    }else{
                        // now I need to discard all until I found one zero
                        while( flp == k){
                            if(nums[lo] == 0) flp--;
                            lo++;
                        }
                        flp++;
                    }
                }

                hi++;
                // System.out.println("ed: " + lo + " : " + hi + " : " + ans + " : " + flp);
                // System.out.println("--------------------------------------------");
            }

        } 
        return ans;
    }
}