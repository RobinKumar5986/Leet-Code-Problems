class Solution {
    fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {
        if(original.size != m*n)
            return arrayOf()
        val ans = Array(m){IntArray(n)}
        var ind = 0
        for(i in 0..m-1){
            for(j in 0..n-1){
                ans[i][j] = original[ind]
                ind++
            }
        }
        return ans
    }
}