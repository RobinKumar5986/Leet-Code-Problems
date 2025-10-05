class Solution {
    boolean isDig = false;
    boolean isPv = true;
    String filter(String s){
        int i = 0;
        while( i < s.length()){
            if(s.charAt(i) == ' '){
                i++;
                continue;
            }
            break;
        }
        if(i >= s.length())
            return "";
        
        StringBuilder sb = new StringBuilder();
        //checking for sign
        if(s.charAt(i) == '+' || s.charAt(i) == '-'){
            if(s.charAt(i) == '-')
                isPv = false;
            i++;
        }
        while(i < s.length()){
            char c = s.charAt(i);
            if(c < '0' || c > '9')
                break;
            sb.append(c);
            i++;
        }

        return sb.toString();
    }
    public int myAtoi(String s) {
        s = filter(s);
        if(s.isEmpty())
            return 0;
        long ans = 0;
        int i = 0;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        while(i < s.length()){
            int dig = s.charAt(i) - '0';
            ans = (ans * 10 + dig);
            if(isPv && ans > max)
                return max;
            if(!isPv && (ans * -1) < min)
                return min;
            i++;
        }
        if(!isPv)
            ans = ans * -1;
        return (int)ans;
    }
}