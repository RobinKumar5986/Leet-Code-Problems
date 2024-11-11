class Solution {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public boolean primeSubOperation(int[] nums) {
        boolean flg = true;
        //check if already sorted
        for(int i = 1; i < nums.length;i++){
            if(nums[i] < 2)
                return false;
            if(nums[i-1] >= nums[i]){
                flg = false;
                break;
            }
        }
        if(flg)
            return true;

        for(int i = 0 ; i < nums.length ; i++){
            //reduce the num
            int n = nums[i] - 1;
            for(int j = n ; j >= 2; j--){
                if(isPrime(j)){
                    if(i == 0){
                        nums[i] -= j;
                        break;
                    }else{
                        int t = nums[i] - j;
                        if(nums[i-1] < t){
                            nums[i] = t;
                            break;
                        }
                    }
                }
            }
        }

        for(int i = 1 ; i < nums.length; i++){
            if(nums[i-1] >= nums[i])
                return false;
        }
        return true;
    }
}