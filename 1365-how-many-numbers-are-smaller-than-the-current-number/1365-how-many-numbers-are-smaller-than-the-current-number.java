class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        Arrays.sort(nums);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
        }
        for(int i=0;i<nums.length;i++)
            temp[i]=map.get(temp[i]);
        return temp;
    }
}