class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int count=1;
        for(int i=0;i<sentence.length() ;i++){
            if(sentence.charAt(i)==searchWord.charAt(0)){
                if(i==0){
                    boolean flag=true;
                    for(int j=0;j<searchWord.length() ;j++){
                        if(sentence.charAt(i+j)!=searchWord.charAt(j))
                        {
                            flag=false;
                            break;
                        }
                    }
                    if(flag==true) return count;
                }
                else{
                    if(sentence.charAt(i-1)==' '){
                        boolean flag=true;
                        for(int j=0;j<searchWord.length() ;j++){
                            if(sentence.charAt(i+j)!=searchWord.charAt(j))
                            {
                                flag=false;
                                break;
                            }
                        }

                        if(flag==true) return count;

                    }

                }
                
            }
            if(sentence.charAt(i)==' ') count++;
        }
        return -1;
    }
}
 