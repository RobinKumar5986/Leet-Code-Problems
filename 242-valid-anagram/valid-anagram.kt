class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val map = IntArray(26)
        for(ele in s.toCharArray()){
            map[ele - 'a']++
        }
        for(ele in t.toCharArray()){
            map[ele - 'a']--
        }
        for(i in 0..25){
            if(map[i]!=0)
                return false
        }
        return true
    }
}