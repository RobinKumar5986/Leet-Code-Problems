class Solution {
    public int[][] insert(int[][] grid, int[] nums) {
        if(grid.length == 0){
            // System.out.println("Case 0");
            int[][] ans = new int[1][2];
            ans[0][0] = nums[0];
            ans[0][1] = nums[1];

            return ans; 
        }

        int min = grid[0][0];
        int max = grid[0][1];
        boolean addOne = true;

       
    
        if(nums[1] < min ) {
            // System.out.println("Case 1");
            int[][] ans = new int[grid.length+1][2];
            ans[0][0] = nums[0];
            ans[0][1] = nums[1];

            for(int i = 1; i < ans.length; i++){
                ans[i][0] = grid[i-1][0];
                ans[i][1] = grid[i-1][1];
            }
            return ans;
        }
        if(nums[0] > grid[grid.length-1][1]){
            // System.out.println("Case 2");
            int[][] ans = new int[grid.length+1][2];
            for(int i = 0; i < ans.length-1; i++){
                ans[i][0] = grid[i][0];
                ans[i][1] = grid[i][1];
            }
            ans[ans.length-1][0] = nums[0];
            ans[ans.length-1][1] = nums[1];
            return ans;
        }

        if(min >= nums[0]){
            min = nums[0];
            max = Math.max(max,nums[1]);
            addOne = false;
        }
        List<List<Integer>> lst = new ArrayList<>();
       
        for(int i = 0; i < grid.length; i++){

            int st = grid[i][0];
            int ed = grid[i][1];
            if(max < st) {
                List<Integer> pair = new ArrayList<>();
                pair.add(min);
                pair.add(max);
                lst.add(pair);

                min = st;
                max = ed;
                if(addOne && nums[0] <= st){
                    //special case 
                    if(nums[1] < st){
                        List<Integer> pair2 = new ArrayList<>();
                        pair2.add(nums[0]);
                        pair2.add(nums[1]);
                        lst.add(pair2);
                        min = st;
                        max = ed;
                    }else{
                        min = nums[0];
                        max = Math.max(nums[1], ed);
                    }
                    addOne = true;
                }
                
            }
            max = Math.max(max, ed);
            if(addOne && nums[0] <= max) {
                max = Math.max(nums[1],max);
                addOne = false; // new pair is been added. 
            }
            
        }
        List<Integer> pair = new ArrayList<>();
        pair.add(min);
        pair.add(max);
        lst.add(pair);

        int[][] ans = new int[lst.size()][2];
        for(int i = 0 ; i < lst.size(); i++) {
            ans[i][0] = lst.get(i).get(0);
            ans[i][1] = lst.get(i).get(1);
        }

        return ans;
    }
}