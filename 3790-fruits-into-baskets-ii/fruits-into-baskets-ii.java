class Solution {

    public int numOfUnplacedFruits(int[] fr, int[] bk) {
        //1.fr can only placed from left -> right
        //2.can contain only one type
        // what we need to find first max from left.
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