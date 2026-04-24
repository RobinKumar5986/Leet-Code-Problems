class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int co1 = 0;
        int co2 = 0;
        for(char c : moves.toCharArray()){
            //all left & all right
            if(c == 'L' || c == '_'){
                co1++;
            }else{
                co1--;
            }
            
            if(c == 'R' || c == '_'){
                co2++;
            }else{
                co2--;
            }
        }
        return Math.max(Math.abs(co1), Math.abs(co2));
    }
}