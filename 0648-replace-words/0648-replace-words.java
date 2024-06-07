class Solution {
    String match(String s,Set<String> dir){
        
        StringBuilder temp=new StringBuilder();
        for(int i=0;i<s.length();i++){
            temp.append(s.charAt(i));
            if(dir.contains(temp.toString()))
                return temp.toString();
        }
        return temp.toString();
    }
    public String replaceWords(List<String> dirs, String sentence) {
        Set<String> dir=new HashSet<>();
        for(String ele : dirs)
            dir.add(ele);
        
        String[] sen=sentence.split(" ");
        StringBuilder sb=new StringBuilder();

        for(String ele : sen){
            sb.append(match(ele,dir));
            sb.append(" ");
        }
        return sb.toString().trim();   
    }
}