class Solution {
    public int maximumCount(int[] nums) {
        //Binary serch solution
        int lo = 0;
        int hi = nums.length-1;
        int ind = -1;
        while(lo <= hi){
            int mid = (lo + hi)/2;
            if(nums[mid] >= 0){
                ind = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        if(ind == -1)
            return nums.length;
        int ze = 0;
        while(ind < nums.length && nums[ind] == 0){
            ze++;
            ind++;
        }
        int pv = nums.length - ind;
        int ne = nums.length - pv - ze;
        return Math.max(pv , ne);
    }
}