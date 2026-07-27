class Solution {
    public int maxProduct(int[] nums) {
        int n1 = 0;
        int n2 = 0;
        for(int ele : nums){
            boolean flg = false;
            if(ele > n1){
                if(n2 < n1) { n2 = n1; }
                n1 = ele;
                flg = true;
            }
            if( !flg && ele > n2){
                n2 = ele;
            }
        }
        
        return (n1-1) * (n2-1);
    }
}