class Solution {
    fun groupAnagrams(arr: Array<String>): List<List<String>> {
        val ans : MutableList<MutableList<String>> = mutableListOf()
        val map : HashMap<String,MutableList<String>> = hashMapOf()
        for(ele in arr){
            val char = ele.toCharArray()
            val key = getString(char)
            if( !map.containsKey(key) ){
                map.put(key,mutableListOf())
            }
            val list = map[key]!!
            list.add(ele)
            map[key] = list
        }
        for(ele in map.values){
            ans.add(ele)
        }
        return ans
    }
    fun getString(char : CharArray) : String{
        val sb = StringBuilder()
        val keyArr = IntArray(26)
        for(ele in char){
            
            keyArr[ele - 'a'] = keyArr[ele - 'a'] + 1
            
        } 
        for(ele in keyArr){
            sb.append(ele.toString()+",")
        }
    
        return sb.toString()
    }
}