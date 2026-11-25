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

        long pow = 1;
        double ans = 1;
        double factor = x;
        long sum = 0;
        while( sum < power){
            if(pow > power - sum) {
                //need to reset the factor
                factor = x;
                pow = 1;
            }

            ans = ans * factor;
            factor = factor * factor;
            sum += pow;
            pow = pow * 2;
        }
        if(negative)
            return 1 / ans;
        return ans;
    }
}