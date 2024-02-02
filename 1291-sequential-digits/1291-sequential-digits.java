class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        if(high<12) return ans;
        int f_n=0;
        int count=1;
        int temp=low;
        while(temp!=0){
            f_n=f_n*10+count;
            count++;
            temp/=10;
        }
        int remF=(int)Math.pow(10,count-2);
        int first=f_n;
        while(true){
            if(f_n >=low && f_n<=high) ans.add(f_n);
            int last=f_n % 10;
            if(last==9){
                f_n=first;
                int lst=f_n % 10;

                if(lst==9) return ans;

                f_n=f_n * 10 +(lst+1);
                first=f_n;
                remF=remF * 10;
            }else{
                int subNum=f_n % remF;
                f_n=subNum * 10 + (last+1);
                if(f_n > high) return ans;
            }
        }
    }
}