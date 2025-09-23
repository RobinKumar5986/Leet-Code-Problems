class Solution {

    void cleaner(String[] arr){
        for(int i = 0; i < arr.length; i++){
            boolean isStart = true;
            String s = "";
            String str = arr[i];
            for(int j = 0 ; j < str.length() ; j++){
                if(str.charAt(j) == '0' && isStart){
                    continue;
                }
                isStart = false;
                s += str.charAt(j);
            }
            if(s.isEmpty()){
                s = "0";
            }
            arr[i] = s;
        }
    }
    public int compareVersion(String version1, String version2) {
        //step1: split the string based on dot(.)
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        //sanitize the data by removing the leading zeros.
        cleaner(v1);
        cleaner(v2);

        //compare the value and return the and
        int i = 0;
        while( i < v1.length && i < v2.length){
            Integer n1 = Integer.parseInt(v1[i]);
            Integer n2 = Integer.parseInt(v2[i]);
            if(n1 < n2 )
                return -1;
            if(n1 > n2)
                return 1;
            i++;
        }
        while(i < v1.length){
            Integer n1 = Integer.parseInt(v1[i]);
            if(n1 < 0 )
                return -1;
            if(n1 > 0)
                return 1;
            i++;
        }
         while(i < v2.length){
            Integer n2 = Integer.parseInt(v2[i]);
            if(n2 > 0 )
                return -1;
            if(n2 < 0)
                return 1;
            i++;
        }
        return 0;
    }
}