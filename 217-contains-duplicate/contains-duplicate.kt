class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val map = mutableSetOf<Int>();
        for(ele in nums){
            if(map.contains(ele))
                return true;
            map.add(ele)
        }
        return false;
    }
}