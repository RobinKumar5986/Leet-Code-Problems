class Solution {
    public String reorderSpaces(String text) {
        List<String> words = new ArrayList<>();
        String s = "";
        int sp = 0;
        for(int i = 0 ; i < text.length(); i++){
            if(text.charAt(i) == ' '){
                sp++;
                if(!s.isEmpty()){
                    words.add(s);
                }
                s = "";
            }else{
                s += text.charAt(i);
            }
        }
        if(!s.isEmpty()){
            words.add(s);
        }
        if(sp == 0)
            return text;
        StringBuilder ans = new StringBuilder();
        if(words.size() == 1){
            ans.append( words.get(0) );
            for(int i = 0 ; i < sp; i++)
                ans.append( " " );
            return ans.toString();
        }
        String space = "";
        for(int i = 1; i<= sp / (words.size() -1) ; i++)
            space+= " ";
        for(int i = 0 ; i < words.size(); i++){
            ans.append(words.get(i));
            if(i < words.size()-1)
                ans.append(space);
        }
        int rem = sp % (words.size() - 1);
        for(int i = 0 ; i < rem ;i++)
            ans.append(" ");
        return ans.toString();
    }
}