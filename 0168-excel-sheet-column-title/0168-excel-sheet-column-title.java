class Solution {
    public String convertToTitle(int columnNumber) {
        String[] str = new String[]{"Z",
    "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
    "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
    "U", "V", "W", "X", "Y", "Z"
};
        // columnNumber=25;

        String ans="";
        int flag=0;
        while(columnNumber!=0){
            int ind=columnNumber%26;
            // if(ind==0){
            //     columnNumber=columnNumber/26;
            //     columnNumber-=1;
            //     ans="Z"+ans;

            // }
            // else{
                ans=str[ind]+ans;
                if(ind==0){columnNumber-=1;}
                columnNumber=columnNumber/26;

            // }
            System.out.println("ind :"+ind);
            System.out.println("columnNumber :"+columnNumber);

        }

        return ans;
        
    }
}