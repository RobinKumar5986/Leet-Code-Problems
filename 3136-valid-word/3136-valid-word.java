class Solution {
    public boolean isValid(String word) {
        if(word.length()<3) return false;
        Set<Character> set=new HashSet<>();
        set.add('a');set.add('A');
        set.add('e');set.add('E');
        set.add('i');set.add('I');
        set.add('o');set.add('O');
        set.add('u');set.add('U');
    
        boolean isUpLoDig,isVov,isCon,isSpe;
        isSpe=isUpLoDig=isVov=isCon=false;

        for(char c : word.toCharArray()){

            if(( (c>='a' && c<='z') || (c>='A' && c<='Z') ) && !set.contains(c) ) isCon=true;
            if((c>='a' && c<='z' ) || (c>='A' && c<='Z') || (c>='0' && c<='9') ) isUpLoDig=true;
            if(set.contains(c)) isVov=true;
            if(!Character.isLetter(c) && !Character.isDigit(c)) isSpe=true;
            
            if(isSpe) return false; 
            
        }
        if(isUpLoDig && isVov && isCon)
                return true;
        return false;
    }
}