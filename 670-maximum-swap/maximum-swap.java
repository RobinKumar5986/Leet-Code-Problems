class Solution {
    public int maximumSwap(int num) {
        String nums = num + "";
        if(nums.length() <= 1)
            return num;
        int ind1 = -1;
        int ind2 = -1;
        Character max = null;
        for(int i = 1; i<nums.length(); i++){
            char c1 = nums.charAt(i-1);
            char c2 = nums.charAt(i);
            if(c1 < c2) {
                if(ind1 == -1){
                    ind1 = i-1;
                    ind2 = i;
                    max = c2;
                }
                else{
                    if(max < c2){
                        max = c2;
                        ind2 = i;
                    }
                }
            }
        }
        if(ind1 == -1)
            return num;
        char c2 = nums.charAt(ind2);
        for(int i = nums.length() -1 ; i >= 0 ; i--){
            if( nums.charAt(i) == c2){
                ind2 = i;
                break;
            }
        }
        for(int i = 0 ; i< nums.length() ; i++){
            if( nums.charAt(i) < c2){
                ind1 = i;
                break;
            }
        }
        
        char[] newNum = nums.toCharArray();
        char temp = newNum[ind1];
        newNum[ind1] = newNum[ind2];
        newNum[ind2] = temp;
        return Integer.parseInt(new String(newNum));
    }
}