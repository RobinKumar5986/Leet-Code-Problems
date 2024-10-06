class Solution {
    public boolean areSentencesSimilar(String sen1, String sen2) {
        if(sen1.equals(sen2))
            return true;
        if(sen1.length() > sen2.length()){
            String temp = sen1;
            sen1 = sen2;
            sen2 = temp;
        }
        List<String> s1 = Arrays.asList(sen1.split(" "));
        List<String> s2 = Arrays.asList(sen2.split(" "));
        //case 1 : single element
        if(s1.size() == 1){
            if(s1.get(0).equals(s2.get(0)) || s1.get(0).equals( s2.get(s2.size() - 1) ) )
                return true;
            else
                return false;
        }
        //case 2: morethen one element 
        // if(!s1.get(0).equals(s2.get(0)) || !s1.get( s1.size() - 1).equals(s2.get(s2.size() - 1)))
        //     return false;
        int c = 0;
        for(int i = 0;i<s1.size(); i++){
            if(s1.get(i).equals(s2.get(i)))
                c++;
            else
                break;
        }
        if(c==s1.size())
            return true;
        for(int i = 0 ; i<s1.size() ; i++){
            if(s1.get(s1.size() - 1 - i).equals(s2.get(s2.size() - 1 - i)))
                c++;
            else
                break;
        }
        // System.out.println(c);

        if(c>=s1.size())
            return true;
        return false;
    }
}