class Solution {
    int max=Integer.MIN_VALUE;
    int getScore(char[] ltr,int[] score,List<String> sub){
        Map<Character,Integer> map=new HashMap<>();
        int[] allChar=new int[26];
        int scr=0;
        for(char c:ltr)
            map.put(c,map.getOrDefault(c,0)+1);

        for(int i=0;i<sub.size();i++){
            String s=sub.get(i);
            for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                allChar[c-'a']++;
            }
        }
        for(int i=0;i<26;i++){
            if(allChar[i]==0)
                continue;
            char c=(char)(i+'a');
            if(!map.containsKey(c))
                return 0;
            if(allChar[i]>map.get(c))
                return 0;
            scr+=score[i]*allChar[i];
        }
        return scr;
    }
    void allSub(String[] words,List<String> sub,int i,char[] ltr,int[] score){
        if(i==words.length){
            max=Math.max(max,getScore(ltr,score,sub));
            return;
        }
        allSub(words,sub,i+1,ltr,score);
        sub.add(words[i]);

        allSub(words,sub,i+1,ltr,score);
        sub.remove(sub.size()-1);

    }
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        allSub(words,new ArrayList<>(),0,letters,score);
        return max;
    }
}