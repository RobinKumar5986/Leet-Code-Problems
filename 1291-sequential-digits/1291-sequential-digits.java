class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        if(high<12) return ans;
        String seq="123456789";
        for(int end=2;end<=seq.length();end++){
            for(int st=0;st<=seq.length()-end;st++){
                int num=Integer.parseInt(seq.substring(st,st+end));
                if(num>=low && num<=high){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}