class Solution {
    public int equalPairs(int[][] grid) {
        List<String> row = new ArrayList<>();
        HashMap<String,Integer> col = new HashMap<>();
        int count=0;

        for(int i=0;i<grid.length;i++){
            String r="";
            String c="";
            for(int j=0;j<grid.length;j++){
                r=r+grid[i][j]+",";
                c=c+grid[j][i]+",";
            }
            System.out.println("Row : "+r);
            System.out.println("Col : "+c);
            
            row.add(r);
             
            if(!col.containsKey(c)){
                col.put(c,1);
            }else{
                col.put(c,col.get(c)+1);
            }
            
        }

       
        for(int i=0;i<row.size();i++){
            if(col.containsKey(row.get(i))){
                
                // System.out.println("Yes : "+row.get(i));
                count+=col.get(row.get(i));
            }
        }
        return  count;

    }
}