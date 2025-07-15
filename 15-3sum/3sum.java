class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //I like my code...
        Map<Integer, List<Integer>> map = new HashMap<>();
        Set<List<Integer>> ans = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++) {
            if(!map.containsKey(nums[i])){
                map.put(nums[i] , new ArrayList<>());
            }
            List<Integer> set = map.get(nums[i]);
            set.add(i);
            map.put(nums[i],set);
        }
        for(int i = 0 ; i < nums.length; i++){
            int target = 0 - nums[i];
            for(int j = i+1 ; j < nums.length; j++){
                int req = target - nums[j];
                if(map.containsKey(req)){
                    List<Integer> inds = map.get(req);
                    List<Integer> trip = new ArrayList<>();
                    if(inds.size() >= 3){
                        trip.add(nums[i]);
                        trip.add(nums[j]);
                        trip.add(nums[inds.get(0)]);
                        Collections.sort(trip);
                        ans.add(trip);
                    }else{
                        if(!inds.contains(i) && !inds.contains(j)){
                            trip.add(nums[i]);
                            trip.add(nums[j]);
                            trip.add(nums[inds.get(0)]);
                            Collections.sort(trip);
                            ans.add(trip);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}