class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int ele : nums1)
            set.add(ele);

        List<Integer> temp=new ArrayList<>();
        for(int ele : nums2){
            if(set.contains(ele)){
                temp.add(ele);
                set.remove(ele);
            }
        }
        int[] ans=new int[temp.size()];
        int i=0;
        for(int ele : temp)
            ans[i++]=ele;
        return ans;

    }
}