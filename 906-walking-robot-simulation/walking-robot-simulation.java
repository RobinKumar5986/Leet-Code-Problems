class Solution {
    public int getDir(int rot,int dir) {
        // dir can be only from 0 to 3
        if(rot == -1) {
            dir = (dir + 1) % 4; 
        }else{ 
            dir = ( dir - 1 + 4 ) % 4;
        }
        return dir;
    }
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0 , y = 0;
        int dir = 0;
        int ans = 0;
        Set<String> set  = new HashSet<>();
        for(int[] obs : obstacles) {
            String ob = obs[0] + "," + obs[1];
            set.add(ob);
        }
        for(int cmd : commands){
            if(cmd == -1 || cmd == -2){
                dir = getDir(cmd,dir);
                continue;
            }
            for(int i = 1 ; i <= cmd ; i++){
                int tempX = x;
                int tempY = y;
                if(dir == 0) tempY++;
                if(dir == 1) tempX++;
                if(dir == 2) tempY--;
                if(dir == 3) tempX--;

                String cord = tempX + "," + tempY;
                if(set.contains(cord))
                    break;
                x = tempX;
                y = tempY;
                
                ans = Math.max(ans,distance(x,y));
            }
        }
        return ans;

    }
    public int distance(int x, int y) {
        return (x * x) + (y * y);
    }
}