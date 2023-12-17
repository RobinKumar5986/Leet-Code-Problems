class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans=new int[2];
        
        HashMap<Integer,Integer> map=new HashMap<>();
        int m=grid.length;
        int n=grid[0].length;
        
        
        for(int row=0; row<m ; row++)
            for(int col=0; col<n ; col++)
                map.put(grid[row][col] , map.getOrDefault(grid[row][col] , 0) + 1);
            
        int missing=0;
        int repeat=0;
        int num=m*n;
        for(int i=1 ;i<=num ; i++){ 
            
            if(!map.containsKey(i)){
                // System.out.println(i);
                missing=i;
            }else if(map.get(i) >= 2){
                repeat=i;
            }
            
        }
        ans[0]=repeat;
        ans[1]=missing;
        
        return ans;
    }
}