class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,Set<Integer>> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new HashSet<>());
            }
            Set<Integer> set = map.get(nums[i]);
            set.add(i);
            map.put(nums[i],set);
        }
        Set<List<Integer>> sum3 = new HashSet<>();
        for(int i = 0 ; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                int n1 = nums[i];
                int n2 = nums[j];
                int req = -1*(n1+n2);
                if(!map.containsKey(req))
                    continue;
                Set<Integer> set = map.get(req);
                int len = set.size();
                if(set.contains(i))
                    len--;
                if(set.contains(j))
                    len--;
                if(len >= 1){
                    List<Integer> pair = new ArrayList<>();
                    pair.add(nums[i]);
                    pair.add(nums[j]);
                    pair.add(req);
                    pair.sort((a,b) -> a-b);
                    sum3.add(pair);
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(List<Integer> ele : sum3){
            ans.add(ele);
        }
        return ans;
    }
}