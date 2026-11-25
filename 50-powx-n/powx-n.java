class Solution {
    public double myPow(double x, int n) {

        if(n == 0)
            return 1;
        if(x == 0)
            return 0;

        long power = n;
        boolean negative = false;
        if(power < 0){
            negative = true;
            power = -power;
        }

        double ans = 1;
        double factor = x;

        while(power > 0){
            if((power & 1) == 1)
                ans = ans * factor;
            factor = factor * factor;
            power = power >> 1;
        }

        if(negative)
            return 1 / ans;
        return ans;
    }
}