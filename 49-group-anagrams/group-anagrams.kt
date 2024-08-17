class Solution {
    fun groupAnagrams(arr: Array<String>): List<List<String>> {
        val map : HashMap<String,MutableList<String>> = hashMapOf()
        for(ele in arr){
            val key = getString(ele.toCharArray())
            if( !map.containsKey(key) ){
                map.put(key,mutableListOf())
            }
            val list = map[key]!!
            list.add(ele)
            map[key] = list
        }
        return map.values.toList()
    }
    fun getString(char : CharArray) : String{
        val sb = StringBuilder()
        val keyArr = IntArray(26)
        for(ele in char){
            
            keyArr[ele - 'a'] = keyArr[ele - 'a'] + 1
            
        } 
        for(ele in keyArr){
            sb.append(ele).append('#')
        }
        return sb.toString()
    }
}