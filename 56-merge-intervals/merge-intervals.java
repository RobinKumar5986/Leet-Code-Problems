class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums,(a,b) -> {
            if(a[0] == b[0])
                return Integer.compare(a[1],b[1]);
            return Integer.compare(a[0],b[0]);
        });

        int min = nums[0][0];
        int max = nums[0][1];

        List<int[]> lst = new ArrayList<>();
        for(int i = 1; i < nums.length; i++){
            if(nums[i][0] <= max){//overlap
                min = Math.min(min,nums[i][0]);
                max = Math.max(max,nums[i][1]);
            }else{//no overlap push the element
                int[] pair = new int[2];
                pair[0] = min;
                pair[1] = max;
                lst.add(pair);

                min = nums[i][0];
                max = nums[i][1];
            }
        }
        int[] pair = new int[2];
        pair[0] = min;
        pair[1] = max;
        lst.add(pair);

        int[][] ans = new int[lst.size()][2];


        for(int i = 0 ; i < lst.size();i++){
            int[] ele = lst.get(i);
            ans[i][0] = ele[0];
            ans[i][1] = ele[1];
        }

        return ans;

    }
}