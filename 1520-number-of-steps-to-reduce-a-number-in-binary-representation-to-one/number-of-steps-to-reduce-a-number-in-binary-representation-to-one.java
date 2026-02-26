class Solution {
    String addOne(String s) {
        char carr = '1';
        int len = s.length() - 1;
        char[] arr = s.toCharArray();
        while(len >= 0) {
            if(carr == '0' && arr[len] == '0'){
                return new String(arr);
            }
            if(carr == '0' && arr[len] == '1'){
                return new String(arr);
            }
            if(carr == '1' && arr[len] == '0'){
                arr[len] = '1';
                return new String(arr);
            }
            if(carr == '1' && arr[len] == '1'){
                arr[len] = '0';
            }
            len--;
        }
        s = new String(arr);
        if(carr == '1')
            s = '1' + s;
        return s;
    }
    public int numSteps(String s) {
        int ans = 0;
        while(s.length() != 1){
            boolean isOdd = s.charAt(s.length() - 1) == '0' ? false : true;

            if(isOdd) {    
                s = addOne(s); 
            }else{
                s = s.substring(0, s.length() - 1);
            }
            ans++;
        }
        return ans;
    }
}