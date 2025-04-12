class Solution {
    public int minOperations(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();
        boolean flag = true;
        for(int ele : nums){
            if(ele > k && !set.contains(ele))
                set.add(ele);
            if(ele != k)
                flag = false;
            if(ele < k)
                return -1;
        }
        if(flag)
            return 0;
        if(set.isEmpty())
            return -1;
        return set.size();
    }
}