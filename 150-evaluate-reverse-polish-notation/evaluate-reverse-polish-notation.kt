class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stk : MutableList<Int> = mutableListOf()
        for(ele in tokens){
            if(ele.equals("*") || ele.equals("/") || ele.equals("+") || ele.equals("-")){
                val n1 = stk.removeAt(stk.size-1);
                val n2 = stk.removeAt(stk.size-1);
                when(ele){
                    "*" -> stk.add(n2*n1)
                    "/" -> stk.add(n2/n1)
                    "+" -> stk.add(n2+n1)
                    "-" -> stk.add(n2-n1)
                }
            }else{
                stk.add(Integer.parseInt(ele))
            }
        }
        return stk[0]
    }
}