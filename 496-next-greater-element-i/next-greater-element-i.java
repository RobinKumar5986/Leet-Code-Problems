class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[nums1.length];
        int[] nge = new int[nums2.length];
        Arrays.fill(nge,-1);
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums2.length; i++){
            int num = nums2[i];
            while(!stk.isEmpty() && nums2[stk.peek()] < num) {
                int ind = stk.pop();
                nge[ind] = num;
            }
            map.put(nums2[i],i);
            stk.push(i);
        }

        for(int i = 0 ; i < nums1.length; i++){
            int ind = map.get(nums1[i]);
            ans[i] = nge[ind];
        }

        return ans;
    }
}