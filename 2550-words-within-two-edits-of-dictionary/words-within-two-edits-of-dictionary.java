class Solution {
    boolean check(String src, String tar){
        if(src.equals(tar))
            return true;
        int co = 0;
        for(int i = 0 ; i < src.length(); i++){
            if(src.charAt(i) != tar.charAt(i))
                co++;
            if(co > 2)
                return false;
        }
        return true;
    }
    public List<String> twoEditWords(String[] qr, String[] dic) {
        List<String> ans = new ArrayList<>();

        for(int i = 0 ; i < qr.length ; i++){
            for(int j = 0; j < dic.length; j++){
                if(check( qr[i] , dic[j] )){
                    ans.add(qr[i]);
                    break;
                }
            }
        }
        return ans;
    }
}