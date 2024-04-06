class Solution {
    public String minRemoveToMakeValid(String s) {
        String ans="";
        Set<Integer> miss=new HashSet<>();
        Stack<Integer> stk=new Stack<>();

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==40)
                stk.push(i);
            else if(c==41 && !stk.isEmpty())
                stk.pop(); 
            else if( c==41 && stk.isEmpty())
                miss.add(i);
        }
        while(!stk.isEmpty())
            miss.add(stk.pop());
            
        for(int i=0;i<s.length();i++)
            if(!miss.contains(i))
                sb.append(s.charAt(i));

        return new String(sb);
    }
}