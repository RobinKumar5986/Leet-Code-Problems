class Solution {
    public int minOperations(String s) {
        int one = 0;
        int zero = 0;
        boolean toggle = true;
        for(char c : s.toCharArray()) {
            if(toggle && c != '0') 
                zero++;
            if(!toggle && c != '1')
                zero++;

            if(toggle && c != '1')
                one++;
            if(!toggle && c != '0')
                one++;

            toggle = !toggle;
        }
        return Math.min(zero,one);
    }
}