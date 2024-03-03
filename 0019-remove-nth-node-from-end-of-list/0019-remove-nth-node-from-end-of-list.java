class Solution {
    int findLen(ListNode head,int len){
        while(head!=null){
            len++;
            head=head.next;
        }
        return len;
    }
    ListNode removeBack(ListNode head,int len){
        if(len==1) return null;
        else{
            ListNode save=head;
            ListNode prev=null;
            ListNode itr=head;
            while(itr.next!=null){
                prev=itr;
                itr=itr.next;
            }
            prev.next=null;
            head=save;
        }
        return head;
    }
    ListNode removeInd(ListNode head,int len,int n){
        ListNode save=head;
        n=len-n;
        int co=0;
        ListNode prev=null;
        ListNode next=head.next;
        while(co!=n){
            prev=head;
            head=next;
            next=next.next;
            co++;
        }
        prev.next=next;
        return save;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=0;
        len=findLen(head,len);
        if(n==1){
            head=removeBack(head,len);
        }else if(n==len){
            head=head.next;
        }
        else{
            head=removeInd(head,len,n);
        }
        return head;
    }
}