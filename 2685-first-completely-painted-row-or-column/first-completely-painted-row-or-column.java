class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int[][] map = new int[r*c+1][2];
        for(int i = 0; i < r ; i++){
            for(int j = 0; j < c ; j++){
                map[mat[i][j]][0] = i;
                map[mat[i][j]][1] = j;
            }
        }
        int[] reqR = new int[r];
        int[] reqC = new int[c];
        int ind = 0;
        // System.out.println(r + " <:> " + c);
        for(int ele : arr){
            int[] pair = map[ele];
            
            reqR[pair[0]]++;
            reqC[pair[1]]++;
            // System.out.println(reqR[pair[0]]  + " : "+ reqC[pair[1]] + " -> "+ pair[0] + " : "+ pair[1] );
           
            if(reqR[pair[0]] == c || reqC[pair[1]] == r){
                return ind;
            }
            ind++;
        }
        return 0;
    }
}