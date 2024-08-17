class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var lo = 0
        var hi = nums.size-1
        while(lo<=hi){
            val mid = lo + (hi-lo)/2
            when{
                nums[mid]==target -> return mid
                nums[mid] < target -> lo = mid+1
                nums[mid] > target -> hi = mid-1
            }
        }
        return -1
    }
}