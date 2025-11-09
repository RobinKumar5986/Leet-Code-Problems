class Solution {
    public int countOperations(int nums1, int nums2) {
        int ans = 0;
        int n1 = Math.min(nums1,nums2);
        int n2 = Math.max(nums1,nums2);
        while(n1 > 0 && n2 > 0){
            int x = n2 / n1;
            ans += x;
            n2 = n2 - (x * n1);

            // fip the num so the n1 alwas the smallest and n2 alwasy the biggest
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }
        return ans;
    }
}