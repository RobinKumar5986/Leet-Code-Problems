class Solution {
    ListNode reverse(ListNode head){
        ListNode prev=null;
        while(head!=null){
            ListNode temp=head.next;
            head.next=prev;
            prev=head;
            head=temp;
        }
        
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode save=head;
        StringBuilder sb=new StringBuilder();
        while(head!=null){
            sb.append(head.val+"");
            head=head.next;
        }
        if(sb.length()<=1) {
            int num=save.val;
            num*=2;
            int cof=num%10;
            int rem=num/10;

            if(rem==0){
                save.val=cof;
                return save;
            }else{
                ListNode n=new ListNode(cof);
                save.val=rem;
                save.next=n;
                return save;
            }
        }
        int rem=0;

        ListNode itr=new ListNode(0);
        ListNode ans=itr;
        for(int i=sb.length()-1;i>=0;i--){
            int num = Integer.parseInt(sb.charAt(i)+"");
            num=num*2 + rem;
            int cof=num%10;
            rem=num/10;
            
            ListNode n=new ListNode(cof);
            itr.next=n;
            itr=itr.next;
        }
        if(rem!=0){
            ListNode n=new ListNode(rem);
            itr.next=n;
            itr=n;
        }
        return reverse(ans.next);
    }
}