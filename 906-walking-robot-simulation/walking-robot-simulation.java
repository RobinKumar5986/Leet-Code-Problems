class Solution {

    // Direction mapping
    private int changeDir(int dir, int cmd) {
        switch (dir) {
            case 1: 
                if (cmd == -1) dir = 3; 
                else dir = 4; 
                break;
            case 2: 
                if (cmd == -1) dir = 4; 
                else dir = 3; 
                break;
            case 3: 
                if (cmd == -1) dir = 2; 
                else dir = 1; 
                break;
            case 4: 
                if (cmd == -1) dir = 1; 
                else dir = 2; 
                break;
        }
        return dir;
    }

    public int robotSim(int[] commands, int[][] obstacles) {
        int max = 0;
        Set<String> obs = new HashSet<>();
        for (int[] obstacle : obstacles) {
            
            obs.add(obstacle[0] + "," + obstacle[1]);
        }

        int x = 0, y = 0, dir = 1; 
        for (int cmd : commands) {
            if (cmd == -1 || cmd == -2) { 
                dir = changeDir(dir, cmd);
            } else { 
                int tempX = x;
                int tempY = y;
                for (int i = 0; i < cmd; i++) {
                    if (dir == 1) tempY++; 
                    else if (dir == 2) tempY--; 
                    else if (dir == 3) tempX++; 
                    else if (dir == 4) tempX--;
                    
                    if (obs.contains(tempX + "," + tempY)) break;

                    x = tempX;
                    y = tempY;
                    if(((x*x) + (y*y)) > max ) 
                        max = (x*x) + (y*y);
                }
            }
        }
        
        return max;
    }
}
