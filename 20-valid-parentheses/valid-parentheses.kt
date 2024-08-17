class Solution {
    fun isValid(s: String): Boolean {
        val stk = Stack<Char>()
        for(ele in s.toCharArray()){
            if(ele == '(' || ele == '{' || ele == '['){
                stk.push(ele)
            }else{
                if(stk.isEmpty())
                    return false
                val k = stk.pop()
                if( (k == '(' && ele!=')') || 
                    (k == '{' && ele!='}') ||
                    (k == '[' && ele!=']') )
                        return false
            }
        }
        if(!stk.isEmpty())
            return false
        return true
    }
}