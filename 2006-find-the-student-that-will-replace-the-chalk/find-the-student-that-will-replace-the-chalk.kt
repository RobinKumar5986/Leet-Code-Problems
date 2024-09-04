class Solution {
    fun chalkReplacer(chalk: IntArray, k: Int): Int {
        var sum:Long = 0
        chalk.forEach{ sum+=it }
        var rem:Long = k%sum

        chalk.forEachIndexed{ind, it ->
            rem-=it
            if(rem<0)
                return ind
        }
        return 0
    }
}