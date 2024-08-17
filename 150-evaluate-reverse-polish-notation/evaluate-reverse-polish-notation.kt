class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stk = Stack<Int>()
        for(ele in tokens){
            if(ele.equals("*") || ele.equals("/") || ele.equals("+") || ele.equals("-")){
                val n1 = stk.pop();
                val n2 = stk.pop();
                when(ele){
                    "*" -> stk.push(n2*n1)
                    "/" -> stk.push(n2/n1)
                    "+" -> stk.push(n2+n1)
                    "-" -> stk.push(n2-n1)
                }
            }else{
                stk.push(Integer.parseInt(ele))
            }
        }
        return stk.pop()
    }
}