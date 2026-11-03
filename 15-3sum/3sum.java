class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            List<Integer> lst = map.get(nums[i]);
            lst.add(i);
            map.put(nums[i],lst);
        }
        Set<Integer> seen = new HashSet<>();
        Set<List<Integer>> sum3 = new HashSet<>();
        for(int i = 0 ; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            for(int j = i+1; j < nums.length; j++){
                if(j > i + 1 && nums[j] == nums[j-1])
                    continue;
                int n1 = nums[i];
                int n2 = nums[j];
                int req = -1*(n1+n2);
                if(!map.containsKey(req))
                    continue;
                List<Integer> lst = map.get(req);
                for(int ele : lst) {
                    if(ele == i || ele == j || i == j)
                        continue;
                    List<Integer> pair = new ArrayList<>();
                    pair.add(nums[i]);
                    pair.add(nums[j]);
                    pair.add(nums[ele]);
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