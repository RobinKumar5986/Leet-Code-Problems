class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int lo1 = 0;
        int lo2 = 0;
        while(lo1 < nums1.length && lo2 < nums2.length){
            if(nums1[lo1] == nums2[lo2]){
                return nums1[lo1];
            }
            if(nums2[lo2] > nums1[lo1]){
                lo1++;
            }else{
                lo2++;
            }
        }

        return -1;
    }
}