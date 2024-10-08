class Solution {
    public int minSwaps(String s) {
        if(s.length() == 0)
            return 0;
        int op = 0;
        int cl = 0;
        int swap = 0;
        for(char c : s.toCharArray()){
            if(c == ']'){
                if(cl == op){
                    op++;
                    swap++;
                }else{
                    cl++;
                }
            }else{
                op++;
            }
        }
        return swap;
    }
}