class Solution {
    Set<Integer> set = new HashSet<>();
    List<Integer> getInRanger(int lo , int hi) { //bothe same rage example 10 to 99
        List<Integer> ans = new ArrayList<>();
        int len = (lo + "").length(); //max can be a 10 dig number 
        if(len >= 10) len = 9;
        int[] num = new int[len];
        int st = (lo + "").charAt(0) -'0';
        int co = 0;
        for(int i = 1; i <= len ; i++){
            num[i-1] = st;
            st++;
            co++;
            if(st >= 10)break;
        }
        while(true){
            int build = 0;
            boolean flag = false;
            for(int i = 0 ; i < co; i++){
                build = build * 10 + num[i];
                num[i]++;
                if(num[i] >= 10) flag = true;
            }
            if(build > hi ) break;
            if(!set.contains(build) && build >= lo){
                ans.add(build);
                set.add(build);
            }
            if(flag)
                break;
        }
        return ans;

    }
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();
        int lenLo = (low + "").length();
        int lenHi = (high + "").length();
        if(lenLo == lenHi) {
            ans.addAll(getInRanger(low,high));
        }else{
            int diff = lenHi - lenLo;
            for(int i = 0 ; i <= diff ; i++){
                //buildig hi
                long hi = 0;
                for(int j = 0 ; j < (low + "").length() ; j++){
                    hi = hi * 10 + 9;
                }
                if(hi > high) hi = (long)high;
                ans.addAll(getInRanger(low,(int)hi));
                low = (int)hi + 1;
            }
        }
        return ans;
    }
}