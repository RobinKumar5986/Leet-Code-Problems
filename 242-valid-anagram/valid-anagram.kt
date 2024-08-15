class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false
        val map = HashMap<Char,Int>()
        for(ele in s.toCharArray()){
            map[ele] = map.getOrDefault(ele,0)+1
        }
        for(ele in t.toCharArray()){
            if(!map.containsKey(ele)){
                return false
            }
            map[ele] = map[ele]!! - 1
            if( map[ele]== 0)
                map.remove(ele)
        }
        println(map.size)
        if(map.size > 0)
            return false
        return true
    }
}