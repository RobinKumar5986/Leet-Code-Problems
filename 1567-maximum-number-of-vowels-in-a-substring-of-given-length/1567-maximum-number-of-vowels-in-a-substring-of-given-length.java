class Solution {
    public int maxVowels(String s, int k) {
//------------Brute Force---------------------------//
        // int count=Integer.MIN_VALUE;
        // for(int i=0;i<s.length();i++){
        //     int temp=0;
        //     if(k+i<s.length()){
        //         for(int j=i;j<k+i;j++){
        //             char c=s.charAt(j);
        //             if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u'){
        //                 temp++;
        //             }
        //             if(temp>count) count=temp;
        //         }
            
        //     }else{
        //         for(int j=i;j<s.length();j++){
        //             char c=s.charAt(j);
        //             if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u'){
        //                 temp++;
        //             }
        //             if(temp>count) count=temp;
        //         }
        //     }
        // }
        // return count;

        int start=1;
        int v=0;
        int count=0;
        for(int i=0;i<k;i++){
             char c=s.charAt(i);
             if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u') v++;
        }
        if(v>count) count=v;

        System.out.println("Outer v : "+ v);

        for(int i=k;i<s.length();i++){
            char c=s.charAt(i);
            char c2=s.charAt(start-1);
            System.out.println(" c :" + c + " c2 : "+ c2);
            if(k!=1){
                if(c2=='a' || c2=='e' || c2=='i' || c2=='o'|| c2=='u')
                {
                    v--;
                }
                if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u'){
                    v++;
                }
                
            }else{
                if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u'){
                    return 1;
                }
            }
            System.out.println(" v : "+ v);
            start++;
            if(v>count) count=v;
        }
        return count;

    }
}