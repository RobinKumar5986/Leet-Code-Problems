class Solution {
    private String create(char c,int n){
        String s="";
        while(n!=0){
            s+=c;
            n--;
        }
        return s;
    }
    public String customSortString(String order, String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
        }
        String ans="";
        for(int i=0;i<order.length();i++){
            if(freq[order.charAt(i) - 'a']!=0){
                ans+=create(order.charAt(i),freq[order.charAt(i) - 'a']);
                freq[order.charAt(i)-'a']=0;
            }
        }

        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']!=0){
                ans+=s.charAt(i);
                freq[s.charAt(i)-'a']--;
            }
        }
        return ans;
    }
}