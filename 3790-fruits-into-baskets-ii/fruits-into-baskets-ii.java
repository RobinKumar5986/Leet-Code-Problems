class Solution {

    public int numOfUnplacedFruits(int[] fr, int[] bk) {
        boolean[] used = new boolean[100+1];
        int ans = fr.length;
        for(int i = 0 ; i < fr.length; i++){
            for(int j = 0; j<fr.length; j++){
                if(used[j])
                    continue;
                if(bk[j] >= fr[i]){
                    ans--;
                    used[j] = true;
                    break;
                }
            }
        }
        return ans;
    }
}