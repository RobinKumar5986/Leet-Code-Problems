class Solution {

    // Direction mapping
    private int changeDir(int dir, int cmd) {
        switch (dir) {
            case 1: // ↑
                if (cmd == -1) dir = 3; // Left: ←
                else dir = 4; // Right: →
                break;
            case 2: // ↓
                if (cmd == -1) dir = 4; // Right: →
                else dir = 3; // Left: ←
                break;
            case 3: // →
                if (cmd == -1) dir = 2; // Down: ↓
                else dir = 1; // Up: ↑
                break;
            case 4: // ←
                if (cmd == -1) dir = 1; // Up: ↑
                else dir = 2; // Down: ↓
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

        int x = 0, y = 0, dir = 1; // Start facing ↑
        for (int cmd : commands) {
            if (cmd == -1 || cmd == -2) { // Turn command
                dir = changeDir(dir, cmd);
            } else { // Move command
                int tempX = x;
                int tempY = y;
                for (int i = 0; i < cmd; i++) {
                    if (dir == 1) tempY++; // Move ↑
                    else if (dir == 2) tempY--; // Move ↓
                    else if (dir == 3) tempX++; // Move →
                    else if (dir == 4) tempX--; // Move ←

                    if (obs.contains(tempX + "," + tempY)) break; // Stop if obstacle encountered

                    x = tempX;
                    y = tempY;
                    if (((x*x) + (y*y)) > max) 
                        max = (x*x) + (y*y); // Update max distance squared
                }
            }
        }
        
        return max;
    }
}
