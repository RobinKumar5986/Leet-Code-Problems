class Solution {

    public int numOfUnplacedFruits(int[] fr, int[] bk) {
        Set<Integer> set = new HashSet<>();
        int ans = fr.length;
        for(int i = 0 ; i < fr.length; i++){
            for(int j = 0; j<fr.length; j++){
                if(set.contains(j))
                    continue;
                if(bk[j] >= fr[i]){
                    ans--;
                    set.add(j);
                    break;
                }
            }
        }
        return ans;
    }
}