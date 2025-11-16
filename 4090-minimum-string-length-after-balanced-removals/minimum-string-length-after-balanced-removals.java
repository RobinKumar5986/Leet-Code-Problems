class Solution {
    public int minLengthAfterRemovals(String s) {
        int a = 0;
        int b = 0;
        for(char c : s.toCharArray()){
            if(c == 'a'){
                if(b == 0){
                    a++;
                }else{
                    b--;
                }
            }else {
                if(a == 0){
                    b++;
                }else{
                    a--;
                }
            }
        }

        return a+b;
    }
}