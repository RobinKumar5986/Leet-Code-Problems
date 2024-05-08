class Solution {
    public String[] findRelativeRanks(int[] score) {
        int len=score.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++)
            map.put(score[i],i);

        Arrays.sort(score);
        String[] ans=new String[len];

        for(int i=0;i<len;i++){
            int ind=map.get(score[i]);
            if(i+3==len){
                ans[ind]="Bronze Medal";
            }else if(i+2==len){
                ans[ind]="Silver Medal";
            }else if(i+1==len){
                ans[ind]="Gold Medal";
            }else{
                ans[ind]=Integer.toString(len-i);
            }
        }
        
        return ans;
    }
}