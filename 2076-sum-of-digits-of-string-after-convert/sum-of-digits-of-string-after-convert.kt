class Solution {
    fun converter(s: String): String{
        var op = ""
        for( c in s){
            val v = c - 'a' + 1
            op+=v.toString()
        }
        return op
    }
    fun getLucky(s: String, k: Int): Int {
        var op = ""
        var count = 0
        op = converter(s)
        var ans = 0
        while(count < k){
            var div = 10
            var temp = 0
            for(c in op){
                temp += c.toString().toInt()
            }
            op = temp.toString()
            ans = temp
            temp = 0
            count +=1
        }
        return ans
    }
}