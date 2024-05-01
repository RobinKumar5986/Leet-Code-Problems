class Solution {
    public String reversePrefix(String word, char ch) {
        char[] w=word.toCharArray();
        
        StringBuilder sb=new StringBuilder();
        int ind=-1;
        for(int i=0;i<word.length();i++){
            if(w[i]==ch){
                ind=i;
                break;
            }
        }
        if(ind==-1) return word;

        for(int i=ind;i>=0;i--){
            sb.append(w[i]);
        } 
        for(int i=ind+1; i<word.length();i++){
            sb.append(w[i]);
        }
        return sb.toString(); 
    }
}