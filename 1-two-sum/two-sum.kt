class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int,Int>()
        val ans = IntArray(2)
        for(i in 0 until nums.size ){
            map[nums[i]] = i 
        }
    
        for(i in 0 until nums.size ){
            val req = target - nums[i]
            if(map.containsKey(req)){
                if(map.get(req)!=i){
                    ans[0] = i
                    ans[1] = map[req]!!
                    return ans
                }
            } 
        }
        return ans
    }
}