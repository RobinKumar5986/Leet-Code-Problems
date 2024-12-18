class Solution {
    public int[] finalPrices(int[] pr) {
        for(int i = 0 ; i < pr.length ; i++){
            for(int j = i+1; j < pr.length ; j ++){
                if(pr[j] <= pr[i]){
                    pr[i] -= pr[j];
                    break;
                }
            }
        }
        return pr;
    }
}