class Solution {
    public String removeDuplicateLetters(String s) {
        int[] ind=new int[26];
        boolean[] seen=new boolean[26];
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char x=s.charAt(i);
            if(ind[x-'a']<=i) ind[x-'a']=i;
        }

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(st.isEmpty()){
                st.push(c);
                seen[c-'a']=true;
            }else{
                if(!seen[c-'a']){
                    while(!st.isEmpty()&& st.peek()>c ){
                        if(i>=ind[st.peek()-'a'])break;
                        char p=st.pop();
                        seen[p-'a']=false;
                    }
                    st.push(c);
                    seen[c-'a']=true;
                }
            }
        }
        String ans="";
        while(!st.isEmpty()){
            ans=st.pop()+ans;
        }
        return ans;
    }
}