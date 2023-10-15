class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=0;i<n;i++){
            nums1[m++]=nums2[i];
            // int temp
        }
        Arrays.sort(nums1); 
    }
}