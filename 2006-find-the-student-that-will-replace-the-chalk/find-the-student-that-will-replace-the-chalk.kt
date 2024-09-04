class Solution {
    fun chalkReplacer(chalk: IntArray, k: Int): Int {
        var sum:Long = 0
        for(ele in chalk){
            sum+=ele
        }
        var rem:Long = k%sum
        for(i in 0..chalk.size - 1 ){
            rem-=chalk[i]
            if(rem<0)
                return i
        }
        return 0
    }
}