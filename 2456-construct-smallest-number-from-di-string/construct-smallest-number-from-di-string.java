class Solution {
    boolean[] used = new boolean[9+1];
    String ans;
    void lexicography(String s){
        for(int i = 0 ; i < ans.length();i++){
            if(ans.charAt(i) > s.charAt(i)){
                ans = s;
                return;
            }else if (s.charAt(i) > ans.charAt(i)){
                return;
            }
        }
    }
    void backTrack(StringBuilder num,int ind,String pt){
        if (num.length() == pt.length() + 1) {
            lexicography(num.toString());
            return;
        }
        if(ind == 0){
            for(int i = 1; i<= 9 ;i++){
                used[i] = true;
                num.append(i);
                backTrack(num,ind+1,pt);
                num.deleteCharAt(num.length()-1);
                used[i] = false;            
            }
        }else{
            for(int i = 1 ; i<= 9 ;i++){
                if( !used[i]){
                    int len = num.length()-1;
                    if (ind > 0 && ind <= pt.length() && pt.charAt(ind - 1) == 'I') {
                            if(i > num.charAt(len) - '0'){
                                used[i] = true;
                                num.append(i);
                                backTrack(num,ind+1,pt);
                                num.deleteCharAt(num.length()-1);
                                used[i] = false;
                            }
                        }
                        if (ind > 0 && ind <= pt.length() && pt.charAt(ind - 1) == 'D'){
                            if(i < num.charAt(len) - '0'){
                                used[i] = true;
                                num.append(i);
                                backTrack(num,ind+1,pt);
                                num.deleteCharAt(num.length()-1);
                                used[i] = false;
                            }
                        }
                }
            }
        }
    }
    void initializeAns(int length) {
        char[] maxChars = new char[length + 1];
        Arrays.fill(maxChars, '9');
        ans = new String(maxChars);
    }

    public String smallestNumber(String pattern) {
        initializeAns(pattern.length());
        StringBuilder sb = new StringBuilder();
        backTrack(sb,0,pattern);
        return ans;
    }
}