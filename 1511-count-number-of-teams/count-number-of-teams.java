class Solution {
    public int numTeams(int[] rat) {
        int ans=0;
        for(int i=0;i<rat.length;i++){
            for(int j=i+1;j<rat.length;j++){
                for(int k=j+1;k<rat.length;k++){
                    if((rat[i] < rat[j] &&  rat[j] < rat[k]) || (rat[i] > rat[j]  &&  rat[j] > rat[k]))
                        ans++;
                }
                
            }
        }
        return ans;
    }
}