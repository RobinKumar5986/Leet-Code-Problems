class Solution {
    int getNextG(int[] nums,int ind,int num){
        for(int i = ind; i < nums.length; i++){
            if(nums[i] > num)
                return nums[i];
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums2.length; i++){
            map.put(nums2[i],i);
        }

        int[] ans = new int[nums1.length];
        for(int i = 0 ; i < ans.length; i++){
            int ind = map.get(nums1[i]);
            int next = getNextG(nums2,ind,nums1[i]);

            ans[i] = next;
        }
        return ans;
    }
}