class Solution {
    public int divide(int x, int y) {
        if (x == Integer.MIN_VALUE && y == -1) {
            return Integer.MAX_VALUE;
        }
        if (y == 1) {
            return x;
        } else if (y == -1) {
            return -x;
        }

        boolean sign = (x < 0 && y > 0) || (x > 0 && y < 0);

        x = Math.abs(x);
        y = Math.abs(y);

        long lx = Math.abs((long) x);
        long ly = Math.abs((long) y);
        int ans = 0;
         while (lx >= ly) {
            long temp = ly;
            int multiple = 1;

            while (lx >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            lx -= temp;
            ans += multiple;
        }
        if(sign)
            ans *= -1;
        return ans;
    }
}