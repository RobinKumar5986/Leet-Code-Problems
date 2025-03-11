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
        StringBuilder sb = new StringBuilder();
        String space = "";
        if(words.size()-1 != 0){
            for(int i = 1 ; i<= sp/(words.size()-1) ; i++){
                space += " ";
            }
        }
        for(int i = 0; i < words.size(); i++){
            sb.append(words.get(i));
            if(i <  words.size() -1){
                sb.append(space);
            }
        }
        if(words.size() == 1){
            for(int i = 0 ; i < sp ; i++)
                sb.append(" ");
        }else{
            int rem = sp % (words.size()-1);
            for(int i = 0 ; i < rem ; i++)
                sb.append(" ");
        }
        return sb.toString();
    }
}