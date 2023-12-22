class Solution {
    public int maxScore(String s) {
        int zero=0;
        int one=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1')
                one++;
        }
        
        for(int i=0;i<s.length()-1;i++){
            char c=s.charAt(i);
            if(c=='0'){
                zero++;
            }
            if(c=='1'){
                one--;
            }
            if(one+zero > max){
                max=one+zero;
            }
        }
        return max;
    }
}