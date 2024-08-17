class Solution {
    val ans : MutableList<String> = mutableListOf()
    fun generator(n : Int , op : Int , cl : Int , cr : String){
        if(cr.length == n*2)
            ans.add(cr)
        //decision for opening br "("
        if(op < n){
            generator(n,op+1,cl,cr+"(")
        }
        //decision for closing br ")"
        if(cl < op){
            generator(n,op,cl+1,cr+")")
        }

    }
    fun generateParenthesis(n: Int): List<String> {
        generator(n,1,0,"(")
        return ans
    }
}