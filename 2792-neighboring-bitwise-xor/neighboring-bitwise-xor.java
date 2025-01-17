class Solution {
    public boolean doesValidArrayExist(int[] div) {
        if(div.length == 1){
            return div[0] == 0;
        }
            
        int f = -1;
        int prev = -1;
        if(div[0] == 1){
            f = 0;
            prev = 1;
        }
        else{
            f = 0;
            prev = 0;
        }
        for(int i = 1; i < div.length ; i++){
            if(div[i] != 0){
                if(prev == 0){
                    prev = 1;
                }else{
                    prev = 0;
                }
            }
        }
        return f == prev;
    }
}