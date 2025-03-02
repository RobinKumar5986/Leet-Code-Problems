class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> lst = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while(p1 < nums1.length && p2 < nums2.length){
            if(nums1[p1][0] == nums2[p2][0]){
                int[] ele = new int[2];
                ele[0] = nums1[p1][0];
                ele[1] = nums1[p1][1] + nums2[p2][1];
                lst.add(ele);
                p1++;
                p2++;
            }else if(nums1[p1][0] < nums2[p2][0]){
                lst.add(nums1[p1]);
                p1++;
            }else{
                lst.add(nums2[p2]);
                p2++;
            }
        }
        while(p1 < nums1.length){
            lst.add(nums1[p1]);
            p1++;
        }
        while(p2 < nums2.length){
            lst.add(nums2[p2]);
            p2++;
        }
        int[][] ans = new int[lst.size()][2];
        for(int i = 0 ; i < lst.size(); i++){
            ans[i] = lst.get(i);
        }
        return ans;
    }
}