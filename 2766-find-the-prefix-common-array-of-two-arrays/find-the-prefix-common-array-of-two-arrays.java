class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int[] ans = new int[a.length];
        Set<Integer> set = new HashSet<>();
        int co = 0;
        for(int i = 0;i<a.length;i++){
            int e1 = a[i];
            int e2 = b[i];
            if(e1 == e2){
                co++;
            }else{
                if(set.contains(e1)){
                    co++;
                }
                if(set.contains(e2)){
                    co++;
                }
            }
            set.add(e1);
            set.add(e2);
            ans[i] = co;
        }
        return ans;
    }
}