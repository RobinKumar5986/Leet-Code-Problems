class Solution {
    public long[] distance(int[] nums) {
        long[] ans = new long[nums.length];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int ele = nums[i];
            if(!map.containsKey(ele)){
                map.put(ele,new ArrayList<>());
            }
            List<Integer> lst = map.get(ele);
            lst.add(i);
            map.put(ele,lst);
        }
        for(Map.Entry<Integer, List<Integer>> ele : map.entrySet()){
            Integer key = ele.getKey();
            List<Integer> lst = ele.getValue();
            if(lst.size() == 1){
                ans[lst.get(0)] = 0;
                continue;
            }
            int len = lst.size();
            long[] pSum = new long[len];
            pSum[0] = lst.get(0);
            for(int i = 1 ; i < len ; i++) {
                pSum[i] = pSum[i-1] + lst.get(i);
            }

            int prev = 0;
            for(int i = 0 ; i < len ; i++) {
                //right sum
                int num = lst.get(i);
                long s1 = pSum[len-1] - pSum[i]  - ((len - i-1) * (long)num);
                if(i > 0) {
                    long s2 = ( (i *  (long)num) - pSum[i-1]);
                    s1 = s1 + s2;
                }
                ans[num] = s1;
            }
        }
        return ans;
    }
}