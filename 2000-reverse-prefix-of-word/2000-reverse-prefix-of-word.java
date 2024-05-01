class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb=new StringBuilder();
        int ind=-1;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                ind=i;
                break;
            }
        }
        if(ind==-1) return word;

        for(int i=ind;i>=0;i--){
            sb.append(word.charAt(i));
        } 
        for(int i=ind+1; i<word.length();i++){
            sb.append(word.charAt(i));
        }
        return sb.toString(); 
    }
}