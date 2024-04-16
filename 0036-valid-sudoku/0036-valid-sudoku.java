class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> map=new HashSet<>();
        //First Check
        for(int r=0;r<3;r++){
            for(int c=0;c<3;c++){
                map.clear();
                for(int ro=r*3;ro < r*3+3;ro++){
                    for(int co=c*3;co < c*3+3;co++){
                        String s=board[ro][co]+"";
                        if(s.equals("."))
                            continue;
                        if( map.contains(s) )
                            return false;
                        map.add(s);
                    }
                }
            }
        }

        //Second Check
        for(int ro=0;ro<9;ro++){
            for(int co=0;co<9;co++){
                String s=board[ro][co]+"";
                if(s.equals("."))
                    continue;
                for(int i=ro+1;i<9;i++){
                    String s2=board[i][co]+"";
                    if(s.equals(s2))
                        return false;
                }
                for(int i=co+1;i<9;i++){
                    String s2=board[ro][i]+"";
                    if(s.equals(s2))
                        return false;
                }
            }
        }
        return true; 
    }
}