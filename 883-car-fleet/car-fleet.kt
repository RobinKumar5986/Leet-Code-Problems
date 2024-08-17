class Solution {
    fun carFleet(target: Int, position: IntArray, speed: IntArray): Int {
        val n = speed.size
        if(n<=0)
            return 0
        var ans = 1
        val map = position.indices.associate{
            position[it] to speed[it]
        }
        val pos = position.sortedArrayDescending()
        var min = -1.0
        for(ele in pos){
            val speed = map[ele]?: continue 
            val time = (target - ele) / speed.toDouble()
            if(min == -1.0){
                min = time
            }else{
                if(time > min){
                    min = time
                    ans++
                }
            }
        }
        return ans
    }
}