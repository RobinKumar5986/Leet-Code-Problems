class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ans = new int[code.length];
        if(k == 0)
            return ans;
        for(int i = 0 ; i < ans.length; i++){
            int sum = 0;
            int ind = i;
            if(k > 0){
                ind++;
                for(int n = 0 ; n < k ;n++){
                    if(ind == code.length)
                        ind = 0;
                    sum += code[ind++];
                }
            }else{
                ind--;
                int t = k*(-1);
                for(int n = 0 ; n < t ;n++){
                    if(ind < 0)
                        ind = code.length-1;
                    sum += code[ind--];
                }
            }
            ans[i] = sum;
        }
        return ans;
    }
}